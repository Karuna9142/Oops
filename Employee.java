package com.inheritance;

//Person(name,id,city)
//Employee(name,city,sal)(inherit person)
//Student(name,roll_no,dept)(inherit employee class)
//Take input from user scanner
public class Employee extends Person
{
 String name,city;
 double sal;
 
 public void emp_info(String name, String city,double sal)
 {
	System.out.println(super.name+ " "+super.city+ " "+sal); 
	
 }
 
}
