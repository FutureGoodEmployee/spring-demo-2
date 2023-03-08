package com.example.spring2.springdemo2.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hey i'm setting a greeting!!";
    }
}
