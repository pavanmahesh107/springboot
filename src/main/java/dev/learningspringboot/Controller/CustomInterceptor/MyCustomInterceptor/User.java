package dev.learningspringboot.Controller.CustomInterceptor.MyCustomInterceptor;

import org.springframework.stereotype.Component;

@Component

public class User {

    public void getUser(){
        System.out.println("Printing from the Controller Class");
    }
}
