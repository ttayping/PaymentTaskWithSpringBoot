package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Card;
import com.example.paymenttaskwithspringboot.repository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService {
private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card createCard(Card card) {
    return cardRepository.save(card);
    }
}
