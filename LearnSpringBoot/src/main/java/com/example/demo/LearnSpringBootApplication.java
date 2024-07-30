package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
		System.out.println("hello World");
		
		Alien objAlien = context.getBean(Alien.class);
		objAlien.code();
		
		Alien objAlien1 = context.getBean(Alien.class);
		System.out.println(objAlien);
		System.out.println(objAlien1);
}

}
