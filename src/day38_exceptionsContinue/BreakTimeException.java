package day38_exceptionsContinue;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("it's break time");
    }

    public BreakTimeException (String message){
        super(message);
    }


}
