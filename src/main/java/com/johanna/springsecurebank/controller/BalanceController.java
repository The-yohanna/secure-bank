package com.johanna.springsecurebank.controller;

import com.johanna.springsecurebank.model.AccountTransaction;
import com.johanna.springsecurebank.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionRepository accountTransactionsRepository;

    @GetMapping("/myBalance")
    public List<AccountTransaction> getBalanceDetails(@RequestParam int id) {
        return accountTransactionsRepository.
                findByCustomerIdOrderByTransactionDtDesc(id);
    }

}
