package com.shashwenth.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashwenth.chatbot.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
