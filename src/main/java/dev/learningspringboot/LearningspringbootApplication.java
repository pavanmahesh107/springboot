package dev.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "dev.learningspringboot.Controller.Aspectoriented.within") // If we don't mention also No issues, @SpringBootApplication contains @ComponentScan annotation.
public class LearningspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningspringbootApplication.class, args);
    }

}
