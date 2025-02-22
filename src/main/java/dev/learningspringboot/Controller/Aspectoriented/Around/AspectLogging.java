package dev.learningspringboot.Controller.Aspectoriented.Around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

    @Around("execution( * dev.learningspringboot.Controller.Aspectoriented.Around.EmployeeUtil.*())")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("inside before method aspect");
        proceedingJoinPoint.proceed();
        System.out.println("inside after method aspect");
    }
}
