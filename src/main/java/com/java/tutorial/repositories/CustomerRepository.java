package com.java.tutorial.repositories;
import com.java.tutorial.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Iterable<Customer> findAllByOrderByIdAsc();
}
