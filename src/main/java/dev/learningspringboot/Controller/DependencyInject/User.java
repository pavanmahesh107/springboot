package dev.learningspringboot.Controller.DependencyInject;

public class User {

    Order order =new Order(); // Both User & order classes are tightly coupled.
    // To reduce tight coupling we use Dependency Injection. // Why tight coupling matters --> In future If we want to change the structure of Order class(making order class as a Interface)
    // Then this order object also need to be changed. It impacts the user class it needs to be changed.

    public User(){
        System.out.println("User is Initializing");
    }
}
