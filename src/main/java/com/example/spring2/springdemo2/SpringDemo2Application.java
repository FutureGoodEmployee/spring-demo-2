package com.example.spring2.springdemo2;

import com.example.spring2.springdemo2.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDemo2Application.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(controller.sayHello());
	}
}
