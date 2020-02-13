package com.capgemini.lab1.exercise1;

public class CalculateSumFun {
		int sum=0;
	public int calculatesum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
		
	}

}
