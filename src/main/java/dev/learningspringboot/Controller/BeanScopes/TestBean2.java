package dev.learningspringboot.Controller.BeanScopes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)  // Just fo rDemo purpose.
public class TestBean2 {

    @Autowired
    User user;

    public TestBean2(){
        System.out.println("TestBean2 instance initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestBean2 object created: " + this.hashCode() + " User Object initialized: " + user.hashCode());
    }

    @GetMapping(path = "/fetchuser2")
    public ResponseEntity<String> someMethod2(){
        System.out.println("fetchuser2 api invoke");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

}
