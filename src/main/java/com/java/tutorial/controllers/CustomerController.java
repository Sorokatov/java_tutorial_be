package com.java.tutorial.controllers;
import com.java.tutorial.entities.Customer;
import com.java.tutorial.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers() {
        return customerService.getAll();
    }
}
