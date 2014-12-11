package com.monitise.training;

import com.monitise.training.dao.EmployeeDao;
import com.monitise.training.model.EmployeeDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * Created by unlue on 04/12/14.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.monitise.training")
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("printing bean names: ");

        Arrays.stream(ctx.getBeanDefinitionNames())
                .sorted()
                .map(bean -> bean.toString())
                .forEach(bean -> System.out.println(bean));

        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("schema.sql")
                .addScript("data.sql").build();

    }

    @Bean
    public DataSource getDataSource(){
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setPassword("");
        dataSource.setUsername("sa");
        dataSource.setUrl("jdbc:h2:mem:testdb");

        return dataSource;
    }

    @Bean
    public EmployeeDao employeeDao() {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        dao.setDataSource(getDataSource());

        return dao;
    }
}
