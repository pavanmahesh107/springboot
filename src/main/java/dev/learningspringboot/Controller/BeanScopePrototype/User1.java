package dev.learningspringboot.Controller.BeanScopePrototype;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class User1 {

    public User1(){
        System.out.println("User1 initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User1 object hashcode: " + this.hashCode());
    }
}
