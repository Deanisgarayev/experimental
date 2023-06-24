package exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OtherException {
    @ExceptionHandler(RuntimeException.class)
    public void notDineas(RuntimeException e) {
        System.out.println("Ты не Денис, так не интересно");
    }
}
