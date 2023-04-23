package com.example.paymenttaskwithspringboot.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "merchant_list")
@Data
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long merchantId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "url", nullable = false,unique = true)
    private String url;
    @Column(name = "balance",nullable = false)
    private Double balance;
}
