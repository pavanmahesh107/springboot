package dev.learningspringboot.Controller.ConstInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ord3 {

    @Autowired
    Invoice invoice;

    public ord3(){
        System.out.println(".............");
    }
}
