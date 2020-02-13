package com.capgemini.lab1.exercise2;

public class CalculateDifferenceFun {
	int n, sum=0, sum1=0, diff;
	public int calculatedifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=i*i+sum;
		}
		
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+i;
		}
		sum1=sum1*sum1;
		
		diff=sum-sum1;
		
		//System.out.println(diff);
		return diff;
	}

}
