package dev.learningspringboot.Controller.BeanExam;

import org.springframework.stereotype.Component;

@Component
public class SampleUser {

    String User;
    String Pass;

    public SampleUser(){
        System.out.println("Initializing the bean");
    }
    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

}
