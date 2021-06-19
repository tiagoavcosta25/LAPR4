package eapli.base.grammar;

import eapli.base.grammar.antlr.autotask.AutoTaskLexer;
import eapli.base.grammar.antlr.autotask.AutoTaskParser;
import eapli.base.grammar.antlr.autotask.TaskListener;
import eapli.base.grammar.antlr.autotask.TaskVisitor;
import eapli.base.grammar.antlr.validateform.FormListener;
import eapli.base.grammar.antlr.validateform.FormVisitor;
import eapli.base.grammar.antlr.validateform.ValidateFormLexer;
import eapli.base.grammar.antlr.validateform.ValidateFormParser;
import eapli.base.ticketmanagement.domain.Response;
import eapli.base.ticketmanagement.domain.Ticket;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Grupo 03 - 2DI
 *
 * @author Beatriz Seixas 1190424@isep.ipp.pt
 * @author Jéssica Alves 1190682@isep.ipp.pt
 * @author Pedro Santos 1190967@isep.ipp.pt
 * @author Tiago Costa 1191460@isep.ipp.pt
 *
 */
public class ScriptAlgorithms {
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
        return !syntaxError.isError();
    }

    public static boolean executeValidateForm(Response oResponse, ScriptMode oMode) {
        ValidateFormLexer lexer = new ValidateFormLexer(CharStreams.fromString(oResponse.getForm().script().toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ValidateFormParser parser = new ValidateFormParser(tokens);
        ParseTree tree = parser.start(); // parse

        if(oMode.equals(ScriptMode.LISTENER)){
            ParseTreeWalker walker = new ParseTreeWalker();
            FormListener eListener = new FormListener(oResponse);
            walker.walk(eListener, tree);
            return eListener.getResult();
        } else if(oMode.equals(ScriptMode.VISITOR)){
            FormVisitor eval = new FormVisitor(oResponse);
            String strResult = eval.visit(tree);
            return Boolean.valueOf(strResult);
        }
        return false;
    }

    public static boolean executeAutoTask(Ticket oTicket, String strFileContent, ScriptMode oMode) {
        AutoTaskLexer lexer = new AutoTaskLexer(CharStreams.fromString(strFileContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AutoTaskParser parser = new AutoTaskParser(tokens);
        ParseTree tree = parser.start();

        if(oMode.equals(ScriptMode.LISTENER)){
            ParseTreeWalker walker = new ParseTreeWalker();
            TaskListener eListener = new TaskListener(oTicket);
            walker.walk(eListener, tree);
            return eListener.getResult();
        } else if(oMode.equals(ScriptMode.VISITOR)){
            TaskVisitor eval = new TaskVisitor(oTicket);
            return Boolean.parseBoolean(eval.visit(tree));
        }
        return false;
    }
}
