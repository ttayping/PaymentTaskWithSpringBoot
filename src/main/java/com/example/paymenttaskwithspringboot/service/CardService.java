package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Card;
import com.example.paymenttaskwithspringboot.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CardService {
private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card createCard(Card card) {
        return cardRepository.save(card);
    }
    public List<Card> selectAllCards(){
        return cardRepository.findAll();
    }
    public Card getCardByPan(String panNumber){
        List<Card>cardList = selectAllCards();
        for (Card card : cardList) {
            if (Objects.equals(card.getPanNumber(), panNumber)) {
                return card;
            }
        }
        return null;
    }
}
