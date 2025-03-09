package dev.learningspringboot.Controller.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Component
public class UserServices {

    @Async
    public CompletableFuture<String> performTaskAsync(){  // We can use return type of @Async annotation with void,Future<T>, CompletableFuture<T>
        // return new AsyncResult<>("Async Task Result from Future");
        return CompletableFuture.completedFuture("Async Task result from Completable Future");
    }
}
