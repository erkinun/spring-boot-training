package com.monitise.training.dao;

import com.monitise.training.model.Employee;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
public interface EmployeeDao {

    public List<Employee> getEmployeesByAge(int age);
}
