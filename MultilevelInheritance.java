package com.inheritance;
class Animal1
{
	void eat()
	{
		System.out.println("Eating something...");
	}
}
class Dog1 extends Animal
{
	void bark()
	{
		System.out.println("Barking..");
	}
}
class Cat extends Dog1
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.meow();
		c1.bark();
		c1.eat();

	}

}
