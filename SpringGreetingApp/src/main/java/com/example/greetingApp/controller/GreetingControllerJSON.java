package com.example.greetingApp.controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingControllerJSON {
    @GetMapping("/get")
    public String getGreeting(){
        return "{\"message\":\"Hello, Get request!\"}";
    }
    @PostMapping("/post")
    public String postGreeting(@RequestBody Map<String, String> requestBody){
        String name=requestBody.get("name");
        return "{\"message\":\"Hello, "+name+"!\"}";
    }
    @PutMapping("/put")
    public String putGreeting(){
        return "{\"message\":\"Hello, PUT request!\"}";
    }
    @DeleteMapping("/delete")
    public String deleteGreeting(){
        return "{\"message\":\"Hello, DELETE request!\"}";
    }
}
