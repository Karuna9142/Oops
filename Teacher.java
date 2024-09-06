package com.First;

public class Teacher {
	
	static void teacher_info(String name)
	{
		System.out.println("Name:- "+name);
	}
	static void teacher_info(String dept, int age)
	{
		System.out.println("Department:- "+dept+ "Age:- "+age);
	}
	static void teacher_info(float salary,String address)
	{
		System.out.println("Salary:- "+salary+" Address:- "+address);
	}

	public static void main(String[] args) {
		Teacher.teacher_info("Prachi Mam");
		Teacher.teacher_info("BCA", 28);
		Teacher.teacher_info(500000,"Ranchi");
		
		

	}

}
