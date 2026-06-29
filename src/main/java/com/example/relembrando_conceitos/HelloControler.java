package com.example.relembrando_conceitos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")

public class HelloControler {
    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!!";
    }
    
}
