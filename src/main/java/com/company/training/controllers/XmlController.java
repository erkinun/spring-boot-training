package com.company.training.controllers;

import com.company.training.model.GreeterXml;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unlue on 09/12/14.
 */
@RestController
public class XmlController {

    private static Logger LOGGER = Logger.getLogger(XmlController.class);

    @RequestMapping(value = "xml", method = RequestMethod.GET)
    public GreeterXml greetInXml() {

        LOGGER.debug("trying logging in Spring Boot");
        System.out.println("trying to print through stdout");

        return new GreeterXml("xml", "is_my_name");
    }
}
