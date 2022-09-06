package com.example.springbootrestapirequestvalidationexamples.controller;

import com.example.springbootrestapirequestvalidationexamples.entity.Product;
import com.example.springbootrestapirequestvalidationexamples.entity.User;
import com.example.springbootrestapirequestvalidationexamples.repository.ProductRepository;
import com.example.springbootrestapirequestvalidationexamples.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserApi {

    private UserRepository repo;

    public UserApi(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<User> listAll(){
        return repo.findAll();
    }

    @PostMapping
    public User addOne(@RequestBody @Valid User user) {
        return repo.save(user);
    }
}