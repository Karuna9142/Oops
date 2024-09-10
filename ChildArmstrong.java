package com.Constructor;


public class ChildArmstrong {
	
	public void printNum(int num)
	{
		int temp = num;
		double sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			num = num/10;
			sum = sum+rem*rem*rem;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}
