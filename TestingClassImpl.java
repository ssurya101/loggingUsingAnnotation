package com.capriconAI.SpringAIProject1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestingClassImpl {

    @Autowired
    private TestingLogImpl testingLog;

    @LogExecutionTime
    public void processSomething() throws InterruptedException {
        process1();
        testingLog.processLog1();
        Thread.sleep(100); // Simulate work
    }
    @LogExecutionTime
    private void process1() throws InterruptedException{
        process2();
        Thread.sleep(100);
    }
    @LogExecutionTime
    private void process2() throws InterruptedException{
        processx();
        Thread.sleep(100);
    }
    @LogExecutionTime
    public void processx() throws InterruptedException{
        Thread.sleep(100);
    }
}
