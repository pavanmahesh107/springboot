package dev.learningspringboot.Controller.CustomInterceptor.CustomAnnotation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserAspect {

    private final UserService userService;

    public UserAspect(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/userlogging")
    public String getUser() throws InterruptedException{
        return userService.getUser();
    }
}
