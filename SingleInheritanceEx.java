package com.inheritance;

class Animal
{
	//method
	void eat()
	{
		System.out.println("eating pizza...");
	}
}
class Dog extends Animal
{
    
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		System.out.println();
		d1.bark();
		d1.eat();

	}

}
