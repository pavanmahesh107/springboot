package dev.learningspringboot.Controller.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public class NoSqlConnection {

    public NoSqlConnection() {
        System.out.println("Initialization of NoSql Connection");
    }
}
