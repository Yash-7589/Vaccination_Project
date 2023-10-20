package com.example.Vaccination_Project.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        // Logic to handle errors and display a custom error page
        return "error"; // This should be the name of the HTML template for your error page
    }

    @Override
    public String getErrorPath(){
        return "/error";
    }
}