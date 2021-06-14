package eapli.base.grammar;

import org.antlr.v4.runtime.*;

public class SyntaxError extends BaseErrorListener {
    private boolean error;

    public SyntaxError(){
        super();
        error = false;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        this.error = true;
    }

    public boolean isError() {
        return this.error;
    }
}