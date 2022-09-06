package com.example.springbootrestapirequestvalidationexamples.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50, unique = true)
    @Email(message = "Email is not valid")
    @Length(min = 5, max = 50, message = "Email address must be between 5-50 characters")
    private String email;

    @Column(nullable = false, length = 10)
    @Length(min = 5, max = 10, message = "Password must have 5-10 characters")
    private String password;

    @Past(message = "User's birthday must be a date in the past")
    @NotNull
    private Date birthDay;

    @Future(message = "User's diedate must be a date in the future")
    @NotNull
    private Date dieDay;

    public User() {
    }

    public User(Integer id, String email, String password, Date birthDay, Date dieDay) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.birthDay = birthDay;
        this.dieDay = dieDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDieDay() {
        return dieDay;
    }

    public void setDieDay(Date dieDay) {
        this.dieDay = dieDay;
    }
}
