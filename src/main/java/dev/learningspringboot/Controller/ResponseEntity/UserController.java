package dev.learningspringboot.Controller.ResponseEntity;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/api/")
public class UserController {

//    @GetMapping(path = "get-user")
//    public ResponseEntity<String> getUser(){
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("My-Header1","Some Value1");
//        httpHeaders.add("My-Header2","My Value2");
//        return ResponseEntity.status(HttpStatus.OK)
//                .headers(httpHeaders)
//                .body("My Response body object can go here.");

//    @GetMapping(path = "get-user")
//    public ResponseEntity<Void> getUser(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("My Header Name","My Header Value");
//        return ResponseEntity.status(HttpStatus.OK)
//                .headers(headers)
//                .build();
//    }

    @GetMapping(path = "/get-user")
    public String getUser(){
        return "XYZ";
    }

}
