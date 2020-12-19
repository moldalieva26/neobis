package com.demo.docker2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// https://stackify.com/guide-docker-java/ 
@RestController
@RequestMapping("/test")
public class DemoController {
      
      @GetMapping
      public String check() {
           return "Application is alive";
      }
}
// Point a web browser at http://localhost:8081/springbootapp/employees and you see the employee record. ?