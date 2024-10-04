package com.inheritance;
class Employee
{
	float salary = 40000;
}
class Programmer extends Employee
{
    int bonus = 2000;
}
public class InheritanceExa {

	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		System.out.println("Programmer salary:- "+p1.salary);
		System.out.println("Programmer Bonus:- "+p1.bonus);

	}

}
