package dev.learningspringboot.Controller.CustomInterceptor.CustomAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(dev.learningspringboot.Controller.CustomInterceptor.CustomAnnotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Do something before actual method");
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
        if(method.isAnnotationPresent(LogExecutionTime.class)){
            LogExecutionTime logExecutionTime = method.getAnnotation(LogExecutionTime.class);
            System.out.println("Name from annotation " + logExecutionTime.name());
        }
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println("After the actual method");
        long end = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + "executed in " + (end - start) + "ms");
        return result;
    }
}
