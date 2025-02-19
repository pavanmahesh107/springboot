package dev.learningspringboot.Controller.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlconnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySqlConnection {

    public MySqlConnection(){
        System.out.println("Initialization of MySql Connection");
    }
}
