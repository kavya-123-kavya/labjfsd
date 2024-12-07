package com.example.endlabexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.endlabexam.model.Customer;
import com.example.endlabexam.repository.CustomerRepo;
import com.example.endlabexam.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	 @Autowired
	    private CustomerRepo customerRepository;

	    @Autowired
	    private CustomerService customerService;

	    // Insert records manually
	    @PostMapping("/add")
	    public Customer addCustomer(@RequestBody Customer customer) {
	        return customerRepository.save(customer);
	    }

	    // Update customer name and address
	    @PutMapping("/update/{id}")
	    public Customer updateCustomer(@PathVariable Long id, 
	                                    @RequestParam String name, 
	                                    @RequestParam String address) {
	        return customerService.updateCustomer(id, name, address);
	    }

}
