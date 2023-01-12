package com.question3;

public class Bird extends Animal{

	@Override
	public void eat() {
		System.out.println("I am a bird and I eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("I am a bird and I sleep");
		
	}

	public void fly() {
		System.out.println("I am a bird and I can fly");
	}
}
