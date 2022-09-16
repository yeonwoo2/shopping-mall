package com.example.maninstore.handler;

import com.example.maninstore.dto.ResponseDto;
import com.example.maninstore.handler.ex.CustomValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public ResponseDto<String> handlerArgumentException(CustomValidationException e){
        return new ResponseDto<String >(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }
}
