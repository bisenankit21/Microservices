package com.example.cards.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @PostMapping("/cards")
    ResponseEntity<String> createCard(){
        return ResponseEntity.ok("Card created successfully");
    }
}
