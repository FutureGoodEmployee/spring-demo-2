package com.example.spring2.springdemo2.controllers;

import com.example.spring2.springdemo2.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
