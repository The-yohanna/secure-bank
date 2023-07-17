package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.AccountTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountTransactionRepository extends CrudRepository<AccountTransaction, Long> {

    List<AccountTransaction> findByCustomerIdOrderByTransactionDtDesc(int customerId);

}
