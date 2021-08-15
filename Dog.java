package com.syntax.class11;

public class Dog {
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	
	void sleep() {
		System.out.println("Dog can sleep");
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.name = "James"; //taking int from scanner is behavior.
		dog1.color = "White";
		dog1.age = 20;
		dog1.height = 15;
		dog1.gender = 'M';
	
		
		dog1.bark();
		
		Dog dog2 = new Dog();
		dog2.name = "Bongo";
		dog2.breed = "shitzu";
		dog2.color = "Blue";
		dog2.age = 40;
		dog2.height = 10;
		dog2.gender = 'F';
		
		dog2.sleep();
		
	
	}

}
