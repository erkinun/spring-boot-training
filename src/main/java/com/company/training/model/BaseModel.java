package com.company.training.model;

/**
 * Created by unlue on 12/12/14.
 */
public class BaseModel {

    private int returnCode;
    private String message;

    public BaseModel(int returnCode, String message) {
        this.returnCode = returnCode;
        this.message = message;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public String getMessage() {
        return message;
    }

    public static BaseModel success() {
        return new BaseModel(0, "Success");
    }

    public static BaseModel failure() {
        return new BaseModel(1, "Unknown Error");
    }

    public static BaseModel failure(String cause) {
        return new BaseModel(1, cause);
    }
}
