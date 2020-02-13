package com.capgemini.lab6.exercise4;

public class ReplaceConsonentFun {
	public StringBuilder alterstring(String s)
	{
		StringBuilder sb = new StringBuilder();
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				sb.append(ch);
			}
			else
			{
				ch++;
				sb.append(ch);
			}
		}
		return sb;
	}

}
