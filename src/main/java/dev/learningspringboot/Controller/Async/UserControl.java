package dev.learningspringboot.Controller.Async;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@RequestMapping(value = "/api/")
public class UserControl {

    @Autowired
    UserServices userServices;

    @GetMapping(path = "/userservice")
    public String getUserMethod(){
        Future<String> stringFuture = userServices.performTaskAsync();
        String output = null;
        try{
            output = stringFuture.get();  // wait for the performTaskAsync method to execute.
            System.out.println(output);
        } catch (Exception e){
            System.out.println("Some Exception Happened");
        }
        return output;
    }
}
