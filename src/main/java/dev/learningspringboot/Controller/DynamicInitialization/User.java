package dev.learningspringboot.Controller.DynamicInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class User {


    @Qualifier("onlineorderobject")
    @Autowired
    Order order;

    public User(){
        System.out.println("User orders initialized");
    }

    @GetMapping(path = "/createorder")
    public ResponseEntity<String> createOrder(){
        order.createOrder();

        return ResponseEntity.ok("");
    }
}
