package com.polymorphism;

//method overriding is used to achieve run time polymorphism
//method name should be same and it must have the same parameter in the parent class
// also represne IS-A relationship
//we can not override the method as final and static
//can overrid the abstract method
class Human
{
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Boy extends Human
{
	public void eat()
	{
		super.eat();
		System.out.println("Boy is eating");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		Boy b1  = new Boy();
		b1.eat();

	}

}
