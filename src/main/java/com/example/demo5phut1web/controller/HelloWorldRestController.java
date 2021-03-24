package com.example.demo5phut1web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {
    @GetMapping("/123")
    public String hello(){
        return "/test";
    }


}
