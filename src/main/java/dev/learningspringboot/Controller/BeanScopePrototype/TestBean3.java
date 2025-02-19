package dev.learningspringboot.Controller.BeanScopePrototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
@RequestMapping(value = "/api/")
public class TestBean3 {

    @Autowired
    User1 user1;

    @Autowired
    Student student;

    public TestBean3(){
        System.out.println("TestBean3 Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestBean3 object hashcode: " + this.hashCode() + " User1 object hashcode: " + user1.hashCode() + " Student object hashcode: " + student.hashCode());
    }

    @GetMapping(path = "/fetchuser3")
    public ResponseEntity<String> somemethod3(){
        System.out.println("fetchuser3 api invoked");
        System.out.println("Received Request at: " + System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
