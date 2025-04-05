package com.shashwenth.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashwenth.chatbot.model.CustomerCareExecutive;


@Repository
public interface CustomerExecRepo extends JpaRepository<CustomerCareExecutive, Long>{

}
