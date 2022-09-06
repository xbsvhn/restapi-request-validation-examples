package com.example.springbootrestapirequestvalidationexamples.controller;

import com.example.springbootrestapirequestvalidationexamples.entity.Product;
import com.example.springbootrestapirequestvalidationexamples.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductApi {

    private ProductRepository repo;

    public ProductApi(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> listAll(){
        return repo.findAll();
    }

    @PostMapping
    public Product addOne(@RequestBody @Valid Product product) {
        return repo.save(product);
    }
}