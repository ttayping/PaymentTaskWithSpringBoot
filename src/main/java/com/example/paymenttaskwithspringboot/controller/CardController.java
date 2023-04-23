package com.example.paymenttaskwithspringboot.controller;

import com.example.paymenttaskwithspringboot.entity.Card;
import com.example.paymenttaskwithspringboot.service.CardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping ("/createCard")
    public Card createCard (@RequestBody Card card) {
        return cardService.createCard(card);
     }
}
