package dev.learningspringboot.Controller.Aspectoriented.Around;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class EmployeController {

    @Autowired
    EmployeeUtil employeeUtil;

    @GetMapping(path = "/fetcharound")
    public String sampleMethod(){
        employeeUtil.employeeHelperMethod();
        return "Method Around";
    }
}
