package dev.learningspringboot.Controller.Profile;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "prod")
public class MySqlConnection {

    @Value("${Username}")
    String Username;

    @Value("${Password}")
    String Password;

    @PostConstruct
    public void init() {
        System.out.println("The Username is: " + Username + " and Password is: " + Password + " and the connection is: MySqlConnection.");
    }
}
