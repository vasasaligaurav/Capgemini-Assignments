package com.capgemini.lab1.exercise4;

public class CheckNoPowerOfTwo {
	public static boolean checkNumber(int n){

		if (n % 2 != 0) {
		      return false;
		    } else {

		      for (int i = 0; i <= n; i++) {

		        if (Math.pow(2, i) == n)
		        {
		        	return true;
		        }
		      }
		    }
		    return false;
		  }


}
