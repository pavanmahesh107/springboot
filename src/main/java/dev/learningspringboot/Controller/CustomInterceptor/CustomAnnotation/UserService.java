package dev.learningspringboot.Controller.CustomInterceptor.CustomAnnotation;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @LogExecutionTime(name = "user")
    public String getUser() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Get the user details");
        return "User Data";
    }
}
