package com.example.Vaccination_Project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.example.Vaccination_Project.model.index;
import com.example.Vaccination_Project.service.User_serviceIMPL;

@Controller
public class First_Controller {
    @Autowired
    User_serviceIMPL service;


    @GetMapping("/register")
    public String registerform(){
        return "index";
    }

    @PostMapping("/register")
    public String registerFormSubmit(@ModelAttribute index user){
        service.addUser(user);
        return "complete";
    }

    @GetMapping("/users")
    public String listUser(Model model){
        List<index> list=service.selectUser();
        model.addAttribute("users",list);
        return "userdata"; 
    }
}
