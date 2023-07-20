package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loan, Long> {

    @PreAuthorize("hasRole('USER')")
    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);

}
