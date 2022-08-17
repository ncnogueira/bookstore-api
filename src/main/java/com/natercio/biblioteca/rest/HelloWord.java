package com.natercio.biblioteca.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWord {

    @GetMapping("buscar")
    public String getHello(){
        return "Hello Word... This is you new biblioteca app...";
    }
}