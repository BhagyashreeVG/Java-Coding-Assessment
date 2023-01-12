package com.question3;

public class Test {

	public static void main(String[] args) {
		Bird bird1 = new Bird();
		bird1.eat();
		bird1.sleep();
		bird1.fly();

		WildAnimal wildanimal1 = new WildAnimal();
		wildanimal1.eat();
		wildanimal1.sleep();
		wildanimal1.kill();
		
		System.out.println ("Using animal reference and objects of Bird and wild animal");
		Animal animal1 = new Bird();
		Animal animal2 = new WildAnimal();
		
		animal1.eat();
		animal1.sleep();
		
		animal2.eat();
		animal2.sleep();
	}

}
