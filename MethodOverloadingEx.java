package com.polymorphism;

//method overloading
class Shapes
{
	//create method area
	public void area()
	{
		System.out.println("Find area");
	}
	
	//method
	public void area(int r)
	{
		System.out.println("Area of circel:- "+(3.14*r*r));
	}
	//method
	public void area(int l, int b)
	{
		System.out.println("Area of rectangle:- "+(l*b));
	}
}
public class MethodOverloadingEx {

	public static void main(String[] args) {
		Shapes s1 = new Shapes();
		
		s1.area();
		s1.area(4);
		s1.area(4, 5);

	}

}
