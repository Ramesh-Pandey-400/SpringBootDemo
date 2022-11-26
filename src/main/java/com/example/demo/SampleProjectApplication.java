package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = SpringApplication.run(SampleProjectApplication.class, args);
		System.out.println("Hello World!!");
		
		Student newStudent =  context.getBean(Student.class);
		Student ramesh =  context.getBean(Student.class);		
	}

}
