package com.First;

public class Calculator {
	
	public int calc(int a, int b, int c, int d)
	{
		return a+b;
	}
	public double calc(double a, double b)
	{
		return a-b;
	}
	public int calc(int a, int b, int c)
	{
		return a*b*c;
	}
	public double calc(double a, int b)
	{
		return a/b;
	}
	public int calc(int a, int b)
	{
		return a%b;
	}
	public static void main(String[] args)
	{
	 Calculator c1 = new Calculator();
	 System.out.println(c1.calc(2,3,4,5));
	 System.out.println(c1.calc(4.5, 2.2));
	 
	 System.out.println(c1.calc(2,3,4));
	 System.out.println(c1.calc(5,2));
	 
	 System.out.println(c1.calc(10,5));
	  
	}

}
//Employee, Student , Calculation with method overloading
//we have to find interview Question of method oveloading