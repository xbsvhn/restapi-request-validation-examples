package com.example.springbootrestapirequestvalidationexamples.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 512, unique = true)
    @NotBlank(message = "Product name cannot be blank")
    @Length(min = 5, max = 512, message = "Product name must be between 5-512 characters")
    private String name;

    @Min(value = 10, message = "Product price must be greater or equal to 10")
    @Max(value = 9999, message = "Product prices must be less than or equal to 9999")
    private float price;

    public Product() {
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
