package com.johanna.springsecurebank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String getContactInquiryDetails() {
        return "Here are the inquiry details from the DB";
    }

}
