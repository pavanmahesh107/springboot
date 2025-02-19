package dev.learningspringboot.Controller.DynamicInitialization;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("offlineorderobject")
@Component
public class OfflineOrder implements Order{


    public OfflineOrder(){
        System.out.println("Initializing Offline Order");
    }

    @Override
    public void createOrder() {
        System.out.println("created offline order");
    }
}
