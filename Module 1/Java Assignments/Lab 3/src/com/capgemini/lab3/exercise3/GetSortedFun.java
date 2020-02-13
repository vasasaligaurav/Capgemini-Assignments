package com.capgemini.lab3.exercise3;

import java.util.Arrays;

public class GetSortedFun {
	public int[] getSorted(int arr[])
	{
		int n,r,sum;
		for(int i=0;i<arr.length;i++)
		{
			 n=arr[i];
			 sum = 0;
			while(n>0)
			{
				r=n%10;
				sum = (sum*10)+r;
				n=n/10;
			}
			arr[i]=sum;
		}
		Arrays.sort(arr, 0, arr.length);
		return arr;
		
	}

}
