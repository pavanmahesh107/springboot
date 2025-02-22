package dev.learningspringboot.Controller.Aspectoriented;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeLogging(){
        System.out.println("Inside before method aspect");
    }
}
