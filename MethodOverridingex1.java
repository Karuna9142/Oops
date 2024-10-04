package com.polymorphism;

abstract class Flowers
{
	 abstract void lotus();
}
class Rose extends Flowers
{

	@Override
	void lotus()
	{
		System.out.println("National flower of India");
	}
	
}
public class MethodOverridingex1 {

	public static void main(String[] args) {
		Rose r1 = new Rose();
		r1.lotus();

	}

}
