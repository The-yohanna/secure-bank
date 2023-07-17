package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Loan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loan, Long> {

    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);

}
