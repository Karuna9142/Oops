package com.abstraction;

public class Circle extends Shape {
	
	 void area()
	 {
		 System.out.println("Enter the radius");
		 //int radius = sc.nextInt();
		 //double ar = (3.14)*rad*rad;
		 
	 }
	 public static void main(String[] args)
	 {
		Shape s1 = new Circle();
		s1.area();
		s1.msg();
	 }
	

}
