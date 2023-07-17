package com.johanna.springsecurebank.repository;

import com.johanna.springsecurebank.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}
