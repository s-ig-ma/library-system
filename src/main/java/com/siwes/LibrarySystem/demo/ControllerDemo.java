package com.siwes.LibrarySystem.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @GetMapping("/api/v1/hello")
    @ResponseStatus(HttpStatus.OK)
    public String sayHello(){
        return "Hello People";
    }

    @GetMapping("/api/v1/auth/helloo")
    @ResponseStatus(HttpStatus.OK)
    public String sayHello1(){
        return "Hello People";
    }
}
