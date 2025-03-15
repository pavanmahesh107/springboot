package dev.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement   // (Optional) To enable - @Transactional annotation.
@EnableAsync
@ComponentScan(basePackages = "dev.learningspringboot.Controller.ExceptionHandler") // If we don't mention also No issues, @SpringBootApplication contains @ComponentScan annotation.
public class LearningspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningspringbootApplication.class, args);
    }

}
