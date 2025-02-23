package com.example.greetingApp.service;

import com.example.greetingApp.repository.GreetingRepository;
import com.example.greetingApp.model.GreetingModel; // Correct import
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingMessageService {
    private final GreetingRepository repository;

    public GreetingMessageService(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingModel saveGreeting(GreetingModel greeting) {
        return repository.save(greeting); // Fixed incorrect generic type usage
    }

    public List<GreetingModel> getAllGreetings() {
        return repository.findAll();
    }
}
