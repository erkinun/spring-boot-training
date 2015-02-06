package com.company.training.model;

import com.company.training.dao.EmployeeDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public Employee getEmployeeByName(String name) {
        return this.getJdbcTemplate().query("SELECT name, surname, age from employee WHERE name  = ?",
                ps -> ps.setString(1, name),
                this::getEmployee)
                .get(0);
    }

    private Employee getEmployee(ResultSet rs, int rownNum) throws SQLException {
        return new Employee(rs.getString("name"), rs.getString("surname"), rs.getInt("age"));
    }
}
