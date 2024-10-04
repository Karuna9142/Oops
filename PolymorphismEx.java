package com.polymorphism;

class Bird
{
	public void sound()
	{
		System.out.println("Flying....");
	}
}
class Pigeon extends Bird
{
	public void sound()
	{
		System.out.println("Cooing");
	}
}
class Sparrow extends Bird
{
	public void sound()
	{
		System.out.println("Chip...");
	}
}
public class PolymorphismEx {

	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		Pigeon p1 = new Pigeon();
		Bird b1 = new Bird();
		
		
		s1.sound();
		p1.sound();
		b1.sound();
		

	}

}
