package dev.learningspringboot.Controller.BeanExam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SampleUser1 method(){
        return new SampleUser1("UserSampleClass","UserSamplePass");
    }
}
