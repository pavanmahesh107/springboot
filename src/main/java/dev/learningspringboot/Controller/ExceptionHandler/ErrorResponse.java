package dev.learningspringboot.Controller.ExceptionHandler;

import java.util.Date;

public class ErrorResponse {

   private Date Timestamp;
   private String message;
   private int httpStatus;


    public ErrorResponse(Date timestamp, String message, int httpStatus) {
        Timestamp = timestamp;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public String getMessage() {
        return message;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
