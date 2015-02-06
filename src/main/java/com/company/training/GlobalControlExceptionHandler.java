package com.company.training;

import com.company.training.model.BaseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by unlue on 12/12/14.
 */
@ControllerAdvice
public class GlobalControlExceptionHandler {

    @ExceptionHandler(value = IllegalStateException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Object handleIllegalState(IllegalStateException exception) {
        return BaseModel.failure(exception.getMessage());
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public Object handleException(IllegalArgumentException exception) {
        return BaseModel.failure(exception.getMessage());
    }

}
