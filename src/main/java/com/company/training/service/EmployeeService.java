package com.company.training.service;

import com.company.training.model.Employee;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
public interface EmployeeService {

    List<Employee> getEmployeesByAge(int age);

    Employee getEmployeeByName(String name);
}
