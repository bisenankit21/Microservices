package com.example.cards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CardsAlreadyPresentException extends RuntimeException{
    public CardsAlreadyPresentException(String message) {
        super(message);
    }
}
