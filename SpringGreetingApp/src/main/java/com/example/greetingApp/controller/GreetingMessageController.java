package com.example.greetingApp.controller;
import com.example.greetingApp.model.GreetingModel;
import com.example.greetingApp.service.GreetingMessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingMessageController {
    private final GreetingMessageService service;

    public GreetingMessageController(GreetingMessageService service) {
        this.service = service;
    }

    @PostMapping("/post/message")
    public GreetingModel createGreeting(@RequestBody GreetingModel greeting) {
        return service.saveGreeting(greeting);
    }

    @GetMapping("/get/message")
    public List<GreetingModel> getAllGreetings() {
        return service.getAllGreetings();
    }

}
