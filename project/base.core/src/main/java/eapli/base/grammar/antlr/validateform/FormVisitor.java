package eapli.base.grammar.antlr.validateform;

import eapli.base.ticketmanagement.domain.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jéssica Alves 1190682@isep.ipp.pt
 */
public class FormVisitor extends ValidateFormBaseVisitor<Boolean> {

    private Response m_oResponse;

    public FormVisitor(Response r){
        this.m_oResponse = r;
    }

    @Override
    public Boolean visitExecMandatory(ValidateFormParser.ExecMandatoryContext ctx) {
        String str = ctx.agr.getText();

        List<Integer> lstAttributes = new ArrayList<>();

        while(!str.isEmpty()){
            if(str.indexOf(",") == -1){
                lstAttributes.add(Integer.parseInt(str.trim()));
                break;
            }
            lstAttributes.add(Integer.parseInt(str.substring(0, str.indexOf(",")).trim()));
            str = str.substring(str.indexOf(",") + 1);
        }

        Boolean flag = true;

        for(Integer i : lstAttributes){
            if(this.m_oResponse.getResponses().get(i - 1).isEmpty()){
                flag = false;
            }
        }

        return flag;
    }
}