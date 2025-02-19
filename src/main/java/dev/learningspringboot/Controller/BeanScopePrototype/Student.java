package dev.learningspringboot.Controller.BeanScopePrototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    User1 user1;

    public Student(){
        System.out.println("Student Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student object hashcode: " + this.hashCode());
    }
}
