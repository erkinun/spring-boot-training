package com.monitise.training;

import com.monitise.training.model.Greeter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unlue on 04/12/14.
 */
@RestController
public class JsonController {

    @RequestMapping(value = "json", method = RequestMethod.GET)
    public Greeter greetInJson() {
        return new Greeter("unknown-name", "hello world!");
    }
}
