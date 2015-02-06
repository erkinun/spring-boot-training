package com.company.training.model;

/**
 * Created by unlue on 04/12/14.
 */
public class Greeter {

    public String name;
    public String message;

    public Greeter(String name, String message) {
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
