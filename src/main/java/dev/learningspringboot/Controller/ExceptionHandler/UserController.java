package dev.learningspringboot.Controller.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @GetMapping(path = "/get-user")
    public ResponseEntity<?> getUser(){
        throw new CustomException("USerID is missing",HttpStatus.BAD_REQUEST);
    }

    @GetMapping(path = "/get-user-history")
    public ResponseEntity<?> getUserHistory(){
        throw new IllegalArgumentException("Illegal Argument Exception");
    }

    //If we do have same exception Handler in the Global level i.e., Global Exception Handler and Same class
    // the one present in the class level will be picked.
//
//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<String> handleExceptionHandler(CustomException ex){
//        System.out.println("Custom Exception Handler from the Exception Handler");
//        return new ResponseEntity<>(ex.getMessage(),ex.getHttpStatus());
//    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalExceptionHandler(IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }

    // Keeping both errors in a single ExceptionHandler
//    @ExceptionHandler({CustomException.class,IllegalArgumentException.class})
//    public ResponseEntity<String> handleArugumentException(Exception ex){
//        return new  ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
//    }
//    public ResponseEntity<?> getUser(){
//        throw new CustomException("UserID is missing",HttpStatus.BAD_REQUEST);
//    }
//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<Object> handleCustomException(CustomException ex){
//        ErrorResponse errorResponse = new ErrorResponse(new Date(),ex.getMessage(),ex.getHttpStatus().value());
//        return new ResponseEntity<>(errorResponse,ex.getHttpStatus());
//       // return new ResponseEntity<>(ex.getMessage(),ex.getHttpStatus());
//    }
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
//    public ResponseEntity<String> getUser(){
//        return ResponseEntity.status(HttpStatus.ACCEPTED)
//                .body("Request is not correct, User id missing");
//    }
}
