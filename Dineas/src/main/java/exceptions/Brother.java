package exceptions;

public class Brother extends RuntimeException{
    public Brother() {
    }

    public Brother(String message) {
        super(message);
    }

    public Brother(String message, Throwable cause) {
        super(message, cause);
    }
}
