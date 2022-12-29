package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping
    public  String helloWorld(){
        return "Приложение запущено";
    } @GetMapping("/info")
    public  String name(){
        String name = "Руслан";
        String project = "Глупич";
        String date = "29.12.2022";

        return "Имя: "+ name + ", Имя проекта: "+ project +", Дата создания: "+date + ", Описание проекта: что-то тыкаю";
    }

}
