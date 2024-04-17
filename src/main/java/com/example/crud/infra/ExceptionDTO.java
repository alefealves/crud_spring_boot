package com.example.crud.infra;

import org.springframework.http.ResponseEntity;

public class ExceptionDTO {
    String message;

    public ExceptionDTO(String message){
        this.message = message;
    }
}
