package com.example.greetingApp.repository;

import com.example.greetingApp.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingModel,Long> {
}
