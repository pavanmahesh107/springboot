package dev.learningspringboot.Controller.ConstInj;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User2 {

    public Order2 order2;

    public User2(){
        System.out.println("Initializing the User");
    }

    @PostConstruct
    public void init(){
        System.out.println(order2 == null);
    }
}
