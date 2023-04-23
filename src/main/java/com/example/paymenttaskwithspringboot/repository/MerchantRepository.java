package com.example.paymenttaskwithspringboot.repository;

import com.example.paymenttaskwithspringboot.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
