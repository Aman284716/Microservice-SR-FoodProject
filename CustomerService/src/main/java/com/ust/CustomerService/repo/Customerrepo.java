package com.ust.CustomerService.repo;

import com.ust.CustomerService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);
}

