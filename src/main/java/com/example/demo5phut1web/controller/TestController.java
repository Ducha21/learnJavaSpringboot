package com.example.demo5phut1web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @GetMapping("/Test")
    public String Test(){
        return ("/test");
    }
   @GetMapping("/123")
    public String HelloWorldContronller(){
       System.out.println("Hello o phia server");
        return ("/index");
    }
    @PostMapping("/HelloWorldContronller")
   public String HelloWorlding(){
       System.out.println("Hello post from server");
       return "/index";
   }
}

