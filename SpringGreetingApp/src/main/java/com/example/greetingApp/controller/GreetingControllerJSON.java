package com.example.greetingApp.controller;
import com.example.greetingApp.userDTO.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingControllerJSON {
    // GET request to greet and send json data
    @GetMapping
    public Greeting sayHello(){
        return new Greeting("Hello From BridgeLab");
    }

    // POST request to greet and send json data
    @PostMapping("/create")
    public Greeting sayHelloPost(@RequestBody Greeting greet){
        return new Greeting(greet.getMessage());
    }

    // PUT request to update the greet message
    @PutMapping("/update")
    public Greeting updateGreeting(@RequestBody Greeting greet){
        return new Greeting(greet.getMessage() + " message updated");
    }

    // DELETE request to delete the greet message
    @DeleteMapping("/delete")
    public Greeting deleteGreetingMessage(){
        return new Greeting("Message deleted successfully");
    }
}
