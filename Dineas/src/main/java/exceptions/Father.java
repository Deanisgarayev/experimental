package exceptions;

public class Father extends RuntimeException{
    public Father() {
    }

    public Father(String message) {
        super(message);
    }

    public Father(String message, Throwable cause) {
        super(message, cause);
    }
}
