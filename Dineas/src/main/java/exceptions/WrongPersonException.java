package exceptions;

public class WrongPersonException extends RuntimeException{
    public WrongPersonException() {
    }

    public WrongPersonException(String message) {
        super(message);
    }

    public WrongPersonException(String message, Throwable cause) {
        super(message, cause);
    }
}
