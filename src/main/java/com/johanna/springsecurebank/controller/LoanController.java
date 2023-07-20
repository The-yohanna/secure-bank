package com.johanna.springsecurebank.controller;

import com.johanna.springsecurebank.model.Customer;
import com.johanna.springsecurebank.model.Loan;
import com.johanna.springsecurebank.repository.CustomerRepository;
import com.johanna.springsecurebank.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestParam String email) {
        List<Customer> customers = customerRepository.findByEmail(email);
        if (customers != null && !customers.isEmpty()) {
            return loanRepository
                    .findByCustomerIdOrderByStartDtDesc(customers.get(0).getId());
        }
        return null;
    }

}
