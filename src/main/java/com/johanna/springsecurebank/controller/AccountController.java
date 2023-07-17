package com.johanna.springsecurebank.controller;

import com.johanna.springsecurebank.model.Account;
import com.johanna.springsecurebank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountsRepository;

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam int id) {
        return accountsRepository.findByCustomerId(id);
    }

}
