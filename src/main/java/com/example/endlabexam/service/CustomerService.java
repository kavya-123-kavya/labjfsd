package com.example.endlabexam.service;

import com.example.endlabexam.model.Customer;

public interface CustomerService {
	Customer updateCustomer(Long customerId, String name, String address);

}
