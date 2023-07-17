package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByCustomerId(int customerId);

}
