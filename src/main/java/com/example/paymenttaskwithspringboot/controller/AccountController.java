package com.example.paymenttaskwithspringboot.controller;

import com.example.paymenttaskwithspringboot.entity.Account;
import com.example.paymenttaskwithspringboot.service.AccountService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
}
