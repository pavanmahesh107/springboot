package dev.learningspringboot.Controller.Profile;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDBConnection {

    @Value("${Username}")
    String Username;

    @Value("${Password}")
    String Password;

    @PostConstruct
    public void init(){
        System.out.println("The Username is: " + Username + " and Password is: " + Password);
    }
}
