package dev.learningspringboot.Controller.CustomInterceptor.Filters;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserFilter {

    private final UserFil userFil;

    public UserFilter(UserFil userFil){
        this.userFil = userFil;
    }

    @GetMapping(path = "/userfilter")
    public String userSample(){
        userFil.filterMethod();
        System.out.println("Method from User Filter");
        return "Success";
    }
}
