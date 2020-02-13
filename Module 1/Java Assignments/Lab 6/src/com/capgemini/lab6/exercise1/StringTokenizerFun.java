package com.capgemini.lab6.exercise1;
import java.io.*;
import java.util.*;
public class StringTokenizerFun {
	public int stringtoknizer(String s)
	{
		int sum=0;
		 StringTokenizer gav = new  StringTokenizer(s);
		 while(gav.hasMoreTokens())
		 {
			 sum=sum+Integer.parseInt(gav.nextToken(","));
			 
		 }
		 return sum;
	}

}
