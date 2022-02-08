package com.example.migrationdemo.controller;

import com.example.migrationdemo.domain.User;
import com.example.migrationdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return repository.save(user);
    }
}
