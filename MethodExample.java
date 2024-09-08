package com.oops;
import java.util.Scanner;

public class MethodExample
{
	int id;
	String name;
	float salary;
	
	void insert_info(int i, String n, float s)
	{
		id = i;
		name = n;
		salary = s;
	}
	void display()
	{
		System.out.println(id+ " "+name+ " "+salary);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MethodExample m1 = new MethodExample();
		m1.insert_info(10, "Karuna",23400);
		
		m1.display();
		
		
	}

}
