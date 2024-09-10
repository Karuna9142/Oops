package com.inheritance;
import java.util.Scanner;

//Person(name,id,city)
//Employee(name,city,sal)(inherit person)
//Student(name,roll_no,dept)(inherit employee class)
//Take input from user scanner

public class Main {

	public static void main(String[] args) {
	
		/*
		Child c1 = new Child("Karuna", "23","ranchi");
		c1.child_method();
		/*
		Dog d1 = new Dog(01, "Karuna", 45000);
		d1.display();
		*/
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
	
		System.out.println("Enter name and city ");
		String name = sc.nextLine();
		
		String city = sc.nextLine();
		
		System.out.println("Enter roll");
		int roll = sc.nextInt();
		
		System.out.println("Enter department");
		String dept = sc.nextLine();
		sc.next();
		
		System.out.println("Enter your id:-");
		int id = sc.nextInt();
		
		System.out.println("Enter salary:-");
		 double sal = sc.nextDouble();
		
		s1.person_info(name, id, city);
		s1.emp_info(name, city, sal);
		s1.stu_info(roll, dept);
		
		
		
		
		
		
		
		/*
		Animal h1 = new Animal();
		h1.eat();
		h1.feed();
		
		Human h2 = new Human();
		h2.eat();
		h2.bark();
		*/

	}

}
