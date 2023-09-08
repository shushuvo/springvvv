package com.example.school2;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; // Import the CrossOrigin annotation

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:8199")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello");
    }
}

