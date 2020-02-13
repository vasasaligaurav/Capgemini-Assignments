package com.capgemini.lab3.exercise2;

import java.util.Arrays;

public class SortOrderWise {
	public void sort(String arr[])
	{
		Arrays.sort(arr);
		int q;
		
		if(arr.length%2==0)
		{
			q=arr.length/2;
		}
		else
		{
			q=(arr.length+1)/2;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i<q)
			{
				arr[i]=arr[i].toUpperCase();
				
			}
			else
			{
				arr[i]=arr[i].toLowerCase();
			}
			System.out.println(arr[i]);
		}
		
	}

}
