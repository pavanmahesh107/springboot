package dev.learningspringboot.Controller.DynamicInitialization;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("onlineorderobject")
@Component
public class OnlineOrder implements Order{


    public OnlineOrder(){
        System.out.println("Initializing online order");
    }
    @Override
    public void createOrder() {
        System.out.println("Created Online order");
    }
}
