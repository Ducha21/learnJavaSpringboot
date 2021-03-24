package com.example.demo5phut1web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @GetMapping("/helloController")
    public String hello(){

        return "/test";
    }
}

