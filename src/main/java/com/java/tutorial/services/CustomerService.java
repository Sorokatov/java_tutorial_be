package com.java.tutorial.services;
import com.java.tutorial.entities.Customer;
import com.java.tutorial.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> getAll() { return customerRepository.findAllByOrderByIdAsc(); }

    public Customer create(Customer customer) { return customerRepository.save(customer); }

    public void delete(Integer id) { customerRepository.deleteById(id); }

    public Customer update(Customer customer) {
        Customer newCustomer = customerRepository.getOne(customer.getId());
        newCustomer.setFirstName(customer.getFirstName());
        newCustomer.setLastName(customer.getLastName());
        return customerRepository.save(newCustomer);
    }
}
