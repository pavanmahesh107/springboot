package dev.learningspringboot.Controller.Aspectoriented;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class Employee {

    @GetMapping(path = "/fetchitem")
    public String  sampleMethod(){
        return "Item Fetched";
    }
}
