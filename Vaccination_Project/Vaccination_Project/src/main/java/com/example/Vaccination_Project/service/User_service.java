package com.example.Vaccination_Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Vaccination_Project.model.index;
@Service
public interface User_service {
    public index addUser(index obj);
    List<index> selectUser();
}

