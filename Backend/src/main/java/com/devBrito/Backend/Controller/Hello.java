package com.devBrito.Backend.Controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping()
    public String hello(){

            return "Ola hojé é: " + new Date();
        }


    
}
