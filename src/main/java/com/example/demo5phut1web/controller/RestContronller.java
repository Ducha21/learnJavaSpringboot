package com.example.demo5phut1web.controller;

import com.example.demo5phut1web.bean.Student;
import com.example.demo5phut1web.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestContronller {
    HelloWorldService helloWorldService;
    @GetMapping("/duc")
    public Student getStudent(){
        System.out.println("Hello get ");
        return new Student("duc","bắc ninh");
  }
  @PostMapping("/123")
  public String postStudent() {
      System.out.println("Hello post ");
      return "/Student";
  }
}
