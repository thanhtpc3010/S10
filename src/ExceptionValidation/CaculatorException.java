package ExceptionValidation;

public class CaculatorException  extends Exception{
    public CaculatorException(){}
    public CaculatorException(String message){
        super(message);
    }
    //contructor with a message string and throwable obj as parameter
    public CaculatorException(String message, Throwable cause){
        super(message, cause);
    }

}
