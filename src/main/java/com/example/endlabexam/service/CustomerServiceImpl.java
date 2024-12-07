package com.example.endlabexam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.endlabexam.model.Customer;
import com.example.endlabexam.repository.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService{

	 @Autowired
	    private CustomerRepo customerRepository;

	    @Override
	    public Customer updateCustomer(Long customerId, String name, String address) {
	        Optional<Customer> customerOptional = customerRepository.findById(customerId);
	        if (customerOptional.isPresent()) {
	            Customer customer = customerOptional.get();
	            customer.setName(name);
	            customer.setAddress(address);
	            return customerRepository.save(customer);
	        }
	        throw new RuntimeException("Customer not found with ID: " + customerId);
	    }

}
