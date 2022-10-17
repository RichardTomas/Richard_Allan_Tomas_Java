package com.example.m2challengetomasrichardallan.controller;

import com.example.m2challengetomasrichardallan.exception.ArgumentNotValidException;
import com.example.m2challengetomasrichardallan.model.CustomErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    // Referenced part of the record store app on October 5, 2022 in class
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<CustomErrorResponse> handleNullPointerException(NullPointerException ex) {

        HttpStatus responseStatus = HttpStatus.UNPROCESSABLE_ENTITY;

        CustomErrorResponse errorResponse = new CustomErrorResponse(responseStatus, ex.getMessage());

        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(errorResponse, responseStatus);
        return responseEntity;
    }

    @ExceptionHandler(value = {ArgumentNotValidException.class})
    public ResponseEntity<CustomErrorResponse> handleArgumentNotValidException(ArgumentNotValidException ex) {

        HttpStatus responseStatus = HttpStatus.UNPROCESSABLE_ENTITY;

        CustomErrorResponse errorResponse = new CustomErrorResponse(responseStatus, ex.getMessage());

        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(errorResponse, responseStatus);
        return responseEntity;
    }

    @ExceptionHandler(value = {ArithmeticException.class})
    public ResponseEntity<CustomErrorResponse> handleArithmeticException(ArithmeticException ex) {

        HttpStatus responseStatus = HttpStatus.UNPROCESSABLE_ENTITY;

        CustomErrorResponse errorResponse = new CustomErrorResponse(responseStatus, ex.getMessage());

        ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(errorResponse, responseStatus);
        return responseEntity;
    }

}
