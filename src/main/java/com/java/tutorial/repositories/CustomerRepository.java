package com.java.tutorial.repositories;
import com.java.tutorial.entities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.math.BigInteger;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, BigInteger> {

}
