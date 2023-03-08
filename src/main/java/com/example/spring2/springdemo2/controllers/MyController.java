package com.example.spring2.springdemo2.controllers;

import com.example.spring2.springdemo2.services.GreetingService;
import com.example.spring2.springdemo2.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
