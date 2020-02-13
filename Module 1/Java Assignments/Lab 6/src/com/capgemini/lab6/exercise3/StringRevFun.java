package com.capgemini.lab6.exercise3;

public class StringRevFun {
	public StringBuilder stringrev(String s)
	{
		String j=s;
		StringBuilder sb=new StringBuilder(s);
		StringBuilder sb1=new StringBuilder(s);
		sb.reverse();
		sb1.append("|"+sb);
		return sb1;
	}

}
