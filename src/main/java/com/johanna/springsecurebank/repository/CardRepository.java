package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Card, Long> {

    List<Card> findByCustomerId(int customerId);

}
