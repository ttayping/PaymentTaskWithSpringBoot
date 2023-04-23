package com.example.paymenttaskwithspringboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cards")
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    @Column(name = "pan_number", nullable = false,unique = true)
    private String panNumber;
    @Column(name = "card_balance", nullable = false)
    private Double cardBalance;

    @ManyToOne
    private Account account;
}
