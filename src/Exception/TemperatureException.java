package Exception;

public class TemperatureException  extends Exception{
    public TemperatureException(){
        super();
    }
    public TemperatureException(String message){
        super(message);
    }
    public TemperatureException(String message, Throwable cause){
            super(message, cause);
    }
}
