package com.harshjain.Springboot.Practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/")
    public String helloWorld()
    {
        System.out.println("Welcome to harshjains test api");
        return "Welcome to harshjain's test api";
    }
}
