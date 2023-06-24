package exceptions;

public class Mother extends RuntimeException{
    public Mother() {
    }

    public Mother(String message) {
        super(message);
    }

    public Mother(String message, Throwable cause) {
        super(message, cause);
    }
}
