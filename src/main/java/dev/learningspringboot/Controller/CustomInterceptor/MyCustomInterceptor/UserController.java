package dev.learningspringboot.Controller.CustomInterceptor.MyCustomInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    User user;
    @Autowired
    CustomInterceptor customInterceptor;

    @GetMapping(path = "/getuser")
    public String sampleMethod(){
        user.getUser();
//        try {
//            int i = 0;
//            System.out.println(5 / i);  This try finally block causes not executing the postHandler method.
//        } finally {
//            System.out.println("I don't know what it is");
//        }
        customInterceptor.simpleMethod();
        return "success";
    }
}
