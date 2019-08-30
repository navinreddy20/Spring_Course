package com.telusko.SpringDemo;

public class Alien
{ 
	private int age;
	private Computer com;
	
 	 public Alien() {
		System.out.println("Alien Object Created..");	
 }

 	 

	public Computer getCom() {
		return com;
	}



	public void setCom(Computer com) {
		this.com = com;
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
	com.compile();
}
}
