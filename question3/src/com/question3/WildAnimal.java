package com.question3;

public class WildAnimal extends Animal{
	@Override
	public void eat() {
		System.out.println("I am a wild animal and I eat");
	}

	@Override
	public void sleep() {
		System.out.println("I am a wild animal and I eat");
	}

	public void kill() {
		System.out.println("I am a wild animal and I kill");
	}
}
