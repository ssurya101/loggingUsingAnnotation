package com.capriconAI.SpringAIProject1.controller;

import com.capriconAI.SpringAIProject1.service.TestingClassImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
@RequestMapping
public class TestingController {
    @Autowired
    private TestingClassImpl testingClass;

    @GetMapping("testLogging")
    public void testLogging() throws InterruptedException {
        testingClass.processSomething();
    }
}
