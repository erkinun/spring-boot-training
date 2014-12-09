package com.monitise.training.controllers;

import com.monitise.training.model.GreeterXml;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unlue on 09/12/14.
 */
@RestController
public class XmlController {

    @RequestMapping(value = "xml", method = RequestMethod.GET)
    public GreeterXml greetInXml() {
        return new GreeterXml("xml", "is_my_name");
    }
}
