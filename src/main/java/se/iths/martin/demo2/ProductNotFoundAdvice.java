package se.iths.martin.demo2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductNotFoundAdvice {

    @ExceptionHandler(ProductException.class)
    @ResponseBody //Konverterar Stringen till JsonObjekt
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String productNotFound(ProductException exception){
        return exception.s;
    }

}
