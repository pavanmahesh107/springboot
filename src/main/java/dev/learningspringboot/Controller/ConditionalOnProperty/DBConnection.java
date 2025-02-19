package dev.learningspringboot.Controller.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {

    @Autowired(required = false)
    MySqlConnection mySqlConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init(){
        System.out.println("DB connection is initialized");
        System.out.println("Is mySqlConnection is null: " + Objects.isNull(mySqlConnection));
        System.out.println("Is nosql connection is null: " + Objects.isNull(noSqlConnection));
    }
}
