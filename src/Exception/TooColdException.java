package Exception;

public class TooColdException extends Exception {
    public TooColdException() {
        super();
    }
    public TooColdException(String message) {
        super(message);
    }
    public TooColdException(String message, Throwable cause) {
        super(message, cause);
    }
}
