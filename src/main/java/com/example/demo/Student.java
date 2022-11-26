package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Singleton design pattern -  which create only single Object by default

@Component

//if we use this scope annotation with passing prototype as parameter - multiple objects can be created
@Scope(value = "prototype")
public class Student {
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Called!!");
	}
	
	int rollno;
	String name;
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
