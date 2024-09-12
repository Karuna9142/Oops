package com.encapsulation;
import java.util.Scanner;


public class Person
{
	private int age;
	private void printAge(int age)
	{
		if(age>=24)
		{
			  System.out.println("You are eligible");
		}
		else
		{
			System.out.println("you are not eligible");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:- ");
		int age = sc.nextInt();
		
		Person p1 = new Person();
		p1.printAge(age);
		

	}

}

