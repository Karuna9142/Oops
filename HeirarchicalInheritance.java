package com.inheritance;
class Animal2
{
	void eat()
	{
		System.out.println("Eating....");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class Cat1 extends Animal2
{
	void meow()
	{
		System.out.println("Meowing");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		
		Cat1 c1 = new Cat1();
		c1.meow();
		c1.eat();
		
		Dog2 d1 = new Dog2();
		d1.bark();
		d1.eat();

	}

}
