package com.monitise.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by unlue on 04/12/14.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("printing bean names: ");

        List<String> beanListSorted = Arrays.stream(ctx.getBeanDefinitionNames())
                .sorted()
                .map(bean -> bean.toString())
                .collect(Collectors.toList());

        for (String name : beanListSorted) {
            System.out.println(name);
        }
    }
}
