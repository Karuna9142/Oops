package com.inheritance;

//Person(name,id,city)
//Employee(name,city,sal)(inherit person)
//Student(name,roll_no,dept)(inherit employee class)
//Take input from user scanner
public class Student extends Employee {
	
	
	int roll;
	String dept;
	
	public void stu_info(int roll, String dept )
	{
		System.out.println(super.name+ " "+roll+ " "+dept);
	}
	

}
