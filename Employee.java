package com.First;

public class Employee {
	//method overloading
	//compile time polymorphism
	public void print_info(String name, int id)
	{
		System.out.println("My name and id:- "+name+id);
	}
	public void print_info(int id, int salary )
	{
		System.out.println("My id and salary:- "+id+salary);
	}
	public void print_info(String name, String desg)
	{
		System.out.println("My name and designation is:- "+name+desg);
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee();
		e1.print_info(" Karuna ,", 01);
		e1.print_info(01, 50000);
		e1.print_info(" Karuna, ", "Delhi");
		
		
	}

}
