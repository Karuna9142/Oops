package com.First;

public class Student1 {
	static void stu_info(String name)
	{
		System.out.println("My name is:- "+name);
	}
	static void stu_info(int id,String Dept)
	{
		System.out.println("My id :- " +id+ " and department is:- " +Dept);
	}
	static void stu_info(int fee )
	{
		System.out.println("My College fee is:- "+fee);
	}

	public static void main(String[] args) {
	 
		stu_info("Karuna Mishra");
		stu_info(101, "MCA");
		stu_info(30000);

	}

}
