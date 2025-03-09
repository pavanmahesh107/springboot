package dev.learningspringboot.Controller.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class UserServices {

    @Async
    public Future<String> performTaskAsync(){
        return new AsyncResult<>("Async Task Result");
    }
}
