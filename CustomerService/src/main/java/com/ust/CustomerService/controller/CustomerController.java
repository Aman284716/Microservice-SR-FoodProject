package com.ust.CustomerService.controller;

import com.ust.CustomerService.model.Bookorder;
import com.ust.CustomerService.model.Customer;
//import com.ust.CustomerService.service.CustomerService;
import com.ust.CustomerService.repo.FeignClientOrder;
import com.ust.CustomerService.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private Customerservice customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        return customer.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PostMapping("/addAll")
    public List<Customer> addAllCustomers(@RequestBody List<Customer> customers) {
        return customerService.addAllCustomers(customers);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customerDetails) {
        Customer updatedCustomer = customerService.updateCustomer(id, customerDetails);
        if (updatedCustomer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCustomer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/byname/{name}")
    public List<Customer> getCustomersByName(@PathVariable String name) {
        return customerService.findByName(name);
    }

    @Autowired
    private FeignClientOrder feignClientOrder;

    @GetMapping("/getorders/{cid}")
    public List<Bookorder> getallorders(@PathVariable Long cid) {
        return feignClientOrder.getallorders(cid);
    }
}

