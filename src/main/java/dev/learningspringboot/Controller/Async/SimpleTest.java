package dev.learningspringboot.Controller.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping(value = "/api/")
public class SimpleTest {

    @GetMapping(path = "/userdetails")
    public String getUserMethod(){
        System.out.println("Main Thread: " + Thread.currentThread().getName());
        simpleAsyncMethod();
        return "Hello, World";
    }

    @Async
    public void simpleAsyncMethod(){
        System.out.println("My Thread: " + Thread.currentThread().getName());
    }
}
