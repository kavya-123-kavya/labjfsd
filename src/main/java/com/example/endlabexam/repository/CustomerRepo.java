package com.example.endlabexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.endlabexam.model.Customer;
public interface CustomerRepo extends JpaRepository<Customer, Long>{
	

}
