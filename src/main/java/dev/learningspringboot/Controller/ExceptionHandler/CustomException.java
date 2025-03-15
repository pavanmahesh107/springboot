package dev.learningspringboot.Controller.ExceptionHandler;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    HttpStatus httpStatus;
    String message;

    public CustomException(HttpStatus httpStatus,String message){
        this.httpStatus = httpStatus;
        this.message = message;

    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
