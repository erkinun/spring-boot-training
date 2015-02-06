package com.company.training.dao;

import com.company.training.model.Employee;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
public interface EmployeeDao {

    List<Employee> getEmployeesByAge(int age);

    Employee getEmployeeByName(String name);
}
