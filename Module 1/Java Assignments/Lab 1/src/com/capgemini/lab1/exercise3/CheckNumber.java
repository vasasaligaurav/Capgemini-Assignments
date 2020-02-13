package com.capgemini.lab1.exercise3;

public class CheckNumber {
	
		public boolean checkNumber(int n)
		{
			int s=n;
			while(n>0)
			{
				if(n%10>s)
				{
					return false;
				}
				s=n%10;
				n=n/10;
			}
			return true;
		}

}
