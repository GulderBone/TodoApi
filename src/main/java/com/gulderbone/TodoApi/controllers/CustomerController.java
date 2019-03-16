package com.gulderbone.TodoApi.controllers;

import com.gulderbone.TodoApi.documents.Customer;
import com.gulderbone.TodoApi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @RequestMapping("/customers")
    public Customer customer(@RequestParam(value = "name", defaultValue = "World") String name) {
        return repository.findByFirstName(name);
    }
}
