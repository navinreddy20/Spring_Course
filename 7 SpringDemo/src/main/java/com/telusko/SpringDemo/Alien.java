package com.telusko.SpringDemo;

public class Alien
{ 
	int age;
	
	public Alien() {
		System.out.println("Alien Object Created..");	
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}

public void code() 
{
	System.out.println("Im Coding..");
}
}
