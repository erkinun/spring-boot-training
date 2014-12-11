package com.monitise.training.service;

import com.monitise.training.model.Employee;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
public interface EmployeeService {

    List<Employee> getEmployeesByAge(int age);
}
