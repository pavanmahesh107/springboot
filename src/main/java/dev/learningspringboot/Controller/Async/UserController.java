package dev.learningspringboot.Controller.Async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired()
    UserService userserviceObj;

    @GetMapping(path = "/userreq")
    public String sampleMethod(){
        System.out.println("Inside sampleMethod: " + Thread.currentThread().getName());
        userserviceObj.aSyncMethod();
        return null;
    }
}
