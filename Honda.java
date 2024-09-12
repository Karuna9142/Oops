package com.abstraction;

public class Honda implements Bike, Car {

	public void run()
	{
		System.out.println("this is run method");
	}
	public void avg()
	{
		System.out.println("this is avg method");
	}
	public void engine()
	{
		System.out.println("This is engine method");
	}
	
	public static void main(String[]args)
	{
		Honda h1 = new Honda();
		h1.run();
		h1.avg();
		h1.engine();
	}
}
