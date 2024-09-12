package com.abstraction;
import java.util.Scanner;

public class Calculate  implements Calculation
{
	
	public void multiplication(double a,double b)
	{
		double mul = a*b;
		System.out.println(mul);
	}
	public void division(double a,double b)
	{
		double div = a/b;
		System.out.println(div);
	}
	@Override
	public void addition(double a, double b)
	{
	double add = a+b;
	System.out.println(add);
		
	}
	@Override
	public void subtarction(double a, double b) {
		double sub = a-b;
		System.out.println(sub);
		
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:- ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Calculation c1 = new Calculate();
		c1.addition(a, b);
		c1.subtarction(a, b);
		c1.multiplication(a, b);
		c1.division(a, b);
	}
	
}

