package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Account;
import com.example.paymenttaskwithspringboot.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
