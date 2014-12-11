package com.monitise.training.model;

import com.monitise.training.dao.EmployeeDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by unlue on 09/12/14.
 */
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Override
    public List<Employee> getEmployeesByAge(int age) {
        return this.getJdbcTemplate().query("SELECT name, surname, age from employee WHERE age  > ?",
                ps -> ps.setInt(1, age),
                (rs, rownum) -> new Employee(rs.getString("name"), rs.getString("surname"), rs.getInt("age")));
    }
}
