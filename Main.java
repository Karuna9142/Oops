package com.Constructor;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		ChildArmstrong c1 = new ChildArmstrong();
		c1.printNum(num);
		

	}

}
