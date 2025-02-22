package dev.learningspringboot.Controller.Aspectoriented.Around;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtil {
    public void employeeHelperMethod(){
        System.out.println("Employee Helper Method Called");
    }
}
