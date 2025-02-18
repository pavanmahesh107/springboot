package dev.learningspringboot.Controller.BeanExam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class SampleUser1 {
    String User1;
    String Pass1;

    public SampleUser1(String User1,String Pass1){
        this.User1 = User1;
        this.Pass1 = Pass1;
    }
    public String getUser1() {
        return User1;
    }

    public void setUser1(String user1) {
        User1 = user1;
    }

    public String getPass1() {
        return Pass1;
    }

    public void setPass1(String pass1) {
        Pass1 = pass1;
    }
}
