package com.company.training.controllers;

import com.company.training.model.Greeter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unlue on 12/12/14.
 */
@RestController
public class MvcExampleController {

    @RequestMapping(value = "mvc", method = RequestMethod.GET)
    public Object getOrElse(@RequestParam("number") int number) {

        if (number < 10) {
            return new Greeter("hede", "hodo");
        }
        else if (number > 20) {
            throw new IllegalStateException("actually this is an illegal argument exception");
        }
        else {
            throw new IllegalArgumentException("value sent bigger than 10");
        }
    }
}
