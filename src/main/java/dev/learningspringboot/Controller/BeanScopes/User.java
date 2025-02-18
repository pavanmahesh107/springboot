package dev.learningspringboot.Controller.BeanScopes;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {

    public User(){
        System.out.println("User get initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("user Object hashcode: " + this.hashCode()) ;
    }
}
