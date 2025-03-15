package dev.learningspringboot.Controller.ExceptionHandler;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    HttpStatus httpStatus;
//    String message;

    public CustomException(String message,HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;


    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
//    @Override
//    public String getMessage() {
//        return super.getMessage();
//    }
}
