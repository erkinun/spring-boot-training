package com.monitise.training.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by unlue on 09/12/14.
 */
@XmlRootElement
public class GreeterXml {

    public String name;
    public String message;

    
    public GreeterXml() {
        name = "default";
        message = "message";
    }

    public GreeterXml(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
