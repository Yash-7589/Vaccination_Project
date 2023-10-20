package com.example.Vaccination_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vaccination_Project.model.index;
import com.example.Vaccination_Project.repository.Index_repo;
@Service
public class User_serviceIMPL implements User_service {
    @Autowired
    Index_repo repository;

    @Override
    public index addUser(index obj) {
        return repository.save(obj);
    }
    
    @Override
    public List<index> selectUser() {
        return repository.findAll();
    }
    
}
