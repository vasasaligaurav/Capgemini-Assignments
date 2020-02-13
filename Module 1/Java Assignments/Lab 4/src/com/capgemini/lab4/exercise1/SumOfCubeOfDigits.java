package com.capgemini.lab4.exercise1;

public class SumOfCubeOfDigits {
	public int sumofcubes(int no)
	{
		int sumofcubeofdigits=0,remainder;
		while(no>0)
		{
			remainder=no%10;
			sumofcubeofdigits = remainder*remainder*remainder+sumofcubeofdigits;
			no=no/10;
		}
		return sumofcubeofdigits;
	}

}
