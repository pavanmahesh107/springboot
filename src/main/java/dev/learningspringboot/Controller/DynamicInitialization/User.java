package dev.learningspringboot.Controller.DynamicInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/")
public class User {
    @Qualifier("onlineorderobject")
    @Autowired
    Order onlineOrderobj;

    @Qualifier("offlineorderobject")
    @Autowired
    Order offlineOrderobj;

    public User(){
        System.out.println("User orders initialized");
    }

    @GetMapping(path = "/createorder")
    public ResponseEntity<String> createOrder(@RequestParam boolean isOnlineOrder){

        if(isOnlineOrder){
            onlineOrderobj.createOrder();
        } else{
            offlineOrderobj.createOrder();
        }

        return ResponseEntity.ok("");
    }
}
