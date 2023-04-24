package com.example.paymenttaskwithspringboot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "operations")
@Data
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operationId;

    @Column(name = "card_pan",nullable = false)
    private String cardPan;
    @Column(name = "merchant_name",nullable = false)
    private String merchantName;
    @Column(name = "amount",nullable = false)
    private Double amount;
    @Column(name = "date",nullable = false)
    private LocalDateTime date;

    @ManyToOne
    private Merchant merchant;
    @ManyToOne
    private Card card;

}
