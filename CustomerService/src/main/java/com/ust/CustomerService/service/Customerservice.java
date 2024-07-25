package com.ust.CustomerService.service;


import com.netflix.discovery.converters.Auto;
import com.ust.CustomerService.model.Customer;
//import com.ust.CustomerService.repo.CustomerRepository;
import com.ust.CustomerService.repo.Customerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Customerservice {

   @Autowired
   private Customerrepo customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> addAllCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (!optionalCustomer.isPresent()) {
            // Handle not found case as needed
            return null;
        }

        Customer existingCustomer = optionalCustomer.get();
        existingCustomer.setName(customerDetails.getName());
        existingCustomer.setEmail(customerDetails.getEmail());
        existingCustomer.setAddress(customerDetails.getAddress());

        return customerRepository.save(existingCustomer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
