package com.encapsulation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length and breadth");
       
       int length = sc.nextInt();
       int breadth = sc.nextInt();
       
       Rectangle r1 = new Rectangle();
       
       r1.setLength(length);
       System.out.println(r1.getLength());
       
       r1.setBreadth(breadth);
       System.out.println(r1.getBreadth());
       
       int area = length*breadth;
       System.out.println("Area of Rectangle is:- "+area);
       /*
       System.out.println("Enter your radius:- ");
       int radius = sc.nextInt();
       
       Area a1 = new Area();
       a1.setpi(3.14);
       System.out.println(a1.getpi());
       
       int area =(int) a1.getpi()*radius*radius;
       System.out.println("Area of Circle is:- "+area);
       */
       
       
       
		
		/*
		Student s1 = new Student();
		s1.name = "Karuna";
		System.out.println(s1.name);
		
		System.out.println(s1.email);
		
		s1.setPassword("Karuna123");
		s1.getPassword();
		
		System.out.println(s1.getPassword());
		*/
		/*
		Employee e1 = new Employee();
		
		e1.setBranch("MCA");
		System.out.println(e1.getBranch());
		
		e1.setName("Karuna");
		System.out.println(e1.getName());
		
		e1.roll = 23;
		System.out.println(e1.roll);
		*/
		

	}

}
