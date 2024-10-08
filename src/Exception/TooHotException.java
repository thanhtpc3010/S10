package Exception;

public class TooHotException extends Exception {
    public TooHotException() {
        super();
    }
    public TooHotException(String message) {
        super(message);
    }
    public TooHotException(String message, Throwable cause) {
        super(message, cause);
    }
}
