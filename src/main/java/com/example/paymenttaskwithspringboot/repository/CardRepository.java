package com.example.paymenttaskwithspringboot.repository;


import com.example.paymenttaskwithspringboot.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
