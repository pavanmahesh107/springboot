package dev.learningspringboot.Controller.CustomInterceptor.Filters;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    private final UserFilter userFilter;
    public AppConfig1(UserFilter userFilter) {
        this.userFilter = userFilter;
    }


    @Bean
    public FilterRegistrationBean<CustomFilter> myFirstFilter(){
        FilterRegistrationBean<CustomFilter> customFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        customFilterFilterRegistrationBean.setFilter(new CustomFilter());
        customFilterFilterRegistrationBean.addUrlPatterns("/*");
        customFilterFilterRegistrationBean.setOrder(2);
        return customFilterFilterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<CustomFilter1> mySecondFilter(){
        FilterRegistrationBean<CustomFilter1> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter1());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
