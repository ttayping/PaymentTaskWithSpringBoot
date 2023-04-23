package com.example.paymenttaskwithspringboot.repository;

import com.example.paymenttaskwithspringboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
