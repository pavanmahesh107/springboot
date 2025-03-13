package dev.learningspringboot.Controller.CustomInterceptor.Filters;

import jakarta.servlet.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class CustomFilter1 implements Filter {

    @Autowired
    UserFilter userFilter;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside doFilter before method2");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Inside doFilter after method2");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
