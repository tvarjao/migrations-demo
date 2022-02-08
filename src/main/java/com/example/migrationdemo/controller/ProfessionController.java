package com.example.migrationdemo.controller;

import com.example.migrationdemo.domain.Profession;
import com.example.migrationdemo.repository.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profession")
public class ProfessionController {
    @Autowired
    private ProfessionRepository repository;

    @GetMapping
    public List<Profession> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public Profession save(@RequestBody Profession profession){
        return repository.save(profession);
    }
}
