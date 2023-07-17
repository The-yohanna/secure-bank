package com.johanna.springsecurebank.controller;

import com.johanna.springsecurebank.model.Card;
import com.johanna.springsecurebank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardsRepository;

    @GetMapping("/myCards")
    public List<Card> getCardDetails(@RequestParam int id) {
        return cardsRepository.findByCustomerId(id);
    }

}
