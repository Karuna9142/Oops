package com.encapsulation;

public class Area {
	
	private double pi;
	public int radius;
	
	public double getpi()
	{
		return pi;
	}
	public void setpi(double pi)
	{
		this.pi = pi;
	}
	private void cal_area(int radius)
	{
		int area = (int)pi*radius*radius;
		System.out.println("Area of circle is:- "+area);
	}

}
