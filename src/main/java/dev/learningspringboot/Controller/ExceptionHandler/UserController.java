package dev.learningspringboot.Controller.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @GetMapping(path = "/get-user")
  /*  public ResponseEntity<?> getUser(){
        try{
           throw  new CustomException(HttpStatus.BAD_REQUEST,"Exception Occurred");
        } catch (CustomException e){
            ErrorResponse errorResponse = new ErrorResponse(new Date(),e.getMessage(),e.getHttpStatus().value());
            return new ResponseEntity<>(errorResponse,e.getHttpStatus());
        } catch (Exception e){
            ErrorResponse errorResponse = new ErrorResponse(new Date(), e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    } */
//    public String getUser(){
//        throw new NullPointerException("Throwing the Null pointer exception for testing");  //DefaultErrorAttribute
//    }
//    public String getUser(){
//        throw new CustomException(HttpStatus.BAD_REQUEST,"request is not correct, user id is missing"); //DefaultErrorAttribute
//    }
    public ResponseEntity<String> getUser(){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body("Request is not correct, User id missing");
    }


}
