package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrackingNumberController {

    @Autowired
    private IdGenerationService idGenerationService;

    @GetMapping("/generate")
    public String generateTrackingNumber() {
        return String.valueOf(idGenerationService.generateTrackingNumber());
    }
}