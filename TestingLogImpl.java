package com.capriconAI.SpringAIProject1.service;

import org.springframework.stereotype.Service;

@Service
public class TestingLogImpl {
    @LogExecutionTime
    public void processLog1() throws InterruptedException{
        Thread.sleep(100);
    }
}
