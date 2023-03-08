package com.example.spring2.springdemo2.controllers;

import com.example.spring2.springdemo2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}