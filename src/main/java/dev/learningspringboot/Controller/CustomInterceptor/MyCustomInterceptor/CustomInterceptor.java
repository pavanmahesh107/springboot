package dev.learningspringboot.Controller.CustomInterceptor.MyCustomInterceptor;

import org.springframework.stereotype.Component;

@Component
public class CustomInterceptor {
    @CustInterceptor(key = "userKey")
    public void simpleMethod(){
        System.out.println("Method from Custom Interceptor");
    }
}
