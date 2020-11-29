package com.itacademy.person.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/")
    public String hello(){
        return "hello world!!!";
    }
}
