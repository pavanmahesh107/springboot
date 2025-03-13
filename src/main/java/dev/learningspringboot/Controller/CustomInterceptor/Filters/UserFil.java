package dev.learningspringboot.Controller.CustomInterceptor.Filters;

import org.springframework.stereotype.Component;

@Component
public class UserFil {
    public void filterMethod(){
        System.out.println("Logic from Filter Method");
    }
}
