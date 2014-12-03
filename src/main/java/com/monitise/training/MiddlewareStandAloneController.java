package com.monitise.training;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by unlue on 02/12/14.
 */
@Controller
@EnableAutoConfiguration
public class MiddlewareStandAloneController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(MiddlewareStandAloneController.class, args);
    }
}
