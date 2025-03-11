package dev.learningspringboot.Controller.CustomInterceptor.CustomAnnotation;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @LogExecutionTime
    public String getUser() throws InterruptedException{
        Thread.sleep(1000);
        return "User Data";

    }
}
