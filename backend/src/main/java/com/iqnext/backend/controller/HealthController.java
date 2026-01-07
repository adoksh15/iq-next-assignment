package com.iqnext.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/fifa/api/v1/health")
    public String healthCheck() {
        return "Backend is running successfully";
    }
}
