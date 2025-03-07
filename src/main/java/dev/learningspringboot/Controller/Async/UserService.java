package dev.learningspringboot.Controller.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Async("custom")
public class UserService {

    public void aSyncMethod(){
        System.out.println("Inside Async method: " + Thread.currentThread().getName());
        try{
            Thread.sleep(500000);
        } catch (Exception e){

        }
    }
}
