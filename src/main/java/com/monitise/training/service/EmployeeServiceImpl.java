package com.monitise.training.service;

import com.monitise.training.dao.EmployeeDao;
import com.monitise.training.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeDao.getEmployeeByName(name);
    }

    @Override
    public List<Employee> getEmployeesByAge(int age) {
        return employeeDao.getEmployeesByAge(age);
    }
}
