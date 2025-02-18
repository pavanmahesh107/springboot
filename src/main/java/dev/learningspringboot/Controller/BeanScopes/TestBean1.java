package dev.learningspringboot.Controller.BeanScopes;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
// We haven't defined any scope here, So the defaulted scope is Singleton.
public class TestBean1 {


    @Autowired
    User user;

    public TestBean1(){
        System.out.println("TestBean1 instance initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestBean1 object hashcode: " + this.hashCode() + " User object hashcode: " + user.hashCode());
    }

    @GetMapping(path = "/fetchUser1")
    public ResponseEntity<String> someMethod(){
        System.out.println("fetchuser1 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
