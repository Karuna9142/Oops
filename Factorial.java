package com.oops;

public class Factorial {
	
	void fact(int num)
	{
		int fact = 1;
		for(int i = 1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +num+ " is:- "+fact);
	}

	public static void main(String[] args) {
	
		Factorial f1 = new Factorial();
		f1.fact(5);

	}

}
