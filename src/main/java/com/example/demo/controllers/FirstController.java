package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public  String helloWorld(){
        return "";
    } @GetMapping("/bubu")
    public  String bubu(){
        return "Привет: ";
    }
}
