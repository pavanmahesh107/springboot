package dev.learningspringboot.Controller.ConstInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

    @Lazy
    @Autowired
    ord3 ord3;

    public Invoice(){

        System.out.println(".........");
        System.out.println(".......");
    }

}
