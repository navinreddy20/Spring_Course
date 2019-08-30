package com.telusko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstprojApplication.class, args);
		Alien obj= context.getBean(Alien.class);
		obj.code();
	}

}
