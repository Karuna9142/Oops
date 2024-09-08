package com.oops;

public class MethodExample2
{
	int length;
	int breadth;
	
	public void print_area(int l, int b)
	{
		length = l;
		breadth = b;
	}
	void display()
	{
		System.out.println("Area of Rectangle is:- " +length*breadth);
	}

	public static void main(String[] args) {
	
		MethodExample2 m1 = new MethodExample2();
		m1.print_area(10, 30);

		m1.display();
	}

}
