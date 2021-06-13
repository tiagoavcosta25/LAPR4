package eapli.base.grammar;

import eapli.base.grammar.antlr.autotask.AutoTaskLexer;
import eapli.base.grammar.antlr.autotask.AutoTaskParser;
import eapli.base.grammar.antlr.validateform.ValidateFormLexer;
import eapli.base.grammar.antlr.validateform.ValidateFormParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @author Tiago Costa 1191460@isep.ipp.pt
 */
public class ValidateScript {
    public static boolean validateForm(String strPath) throws IOException {
        ValidateFormLexer lexer = new ValidateFormLexer(CharStreams.fromFileName(strPath));
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        ValidateFormParser parser = new ValidateFormParser(tokens);
        parser.removeErrorListeners();
        SyntaxError syntaxError = new SyntaxError();
        parser.addErrorListener(syntaxError);
        parser.start();

        return !syntaxError.isError();
    }

    public static boolean validateAutoTask(String strPath) throws IOException {
        AutoTaskLexer lexer = new AutoTaskLexer(CharStreams.fromFileName(strPath));
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        AutoTaskParser parser = new AutoTaskParser(tokens);
        parser.removeErrorListeners();
        SyntaxError syntaxError = new SyntaxError();
        parser.addErrorListener(syntaxError);
        parser.start();

        if(syntaxError.isError()){
            return false;
        }
        return true;
    }
}
