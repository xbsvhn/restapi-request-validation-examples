package com.example.springbootrestapirequestvalidationexamples.repository;

import com.example.springbootrestapirequestvalidationexamples.entity.Product;
import com.example.springbootrestapirequestvalidationexamples.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
