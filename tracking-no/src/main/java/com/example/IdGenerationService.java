package com.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdGenerationService {

    @Autowired
    private SnowflakeIdGenerator idGenerator;

    @PostConstruct
    public void init() {
        long newWorkerId = 100L;
        idGenerator.init(newWorkerId);
    }

    public long generateTrackingNumber() {
        return idGenerator.nextId();
    }
}
