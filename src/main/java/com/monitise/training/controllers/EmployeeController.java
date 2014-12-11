package com.monitise.training.controllers;

import com.monitise.training.model.Employee;
import com.monitise.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employeeService.getEmployeesByAge(0);
    }
}
