package dev.learningspringboot.Controller.ResponseCodes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @GetMapping(path = "/old-get-user")
    public ResponseEntity<Void> getUser(){
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
                .header("Location","/api/new-get-user").build();
    }

    @GetMapping(path = "/new-get-user")
    public ResponseEntity<String> getNewUser(){
        return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
    }
}
