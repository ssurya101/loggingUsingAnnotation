package com.capriconAI.SpringAIProject1.service;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;


@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("Started: " + methodName);

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // invoke method
        long duration = System.currentTimeMillis() - start;

        System.out.println("Completed: " + methodName + ", Time taken: " + duration + " ms");
        return result;
    }
}
