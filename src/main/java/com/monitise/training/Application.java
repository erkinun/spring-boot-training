package com.monitise.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
    }
}
