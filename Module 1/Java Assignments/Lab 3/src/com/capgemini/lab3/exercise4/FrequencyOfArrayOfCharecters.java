package com.capgemini.lab3.exercise4;

public class FrequencyOfArrayOfCharecters {
	public void freuencyofcharacters(char arr[])
	{
		String combinedchars = new String(arr);
		char allcharacters,eachcharacter;
		int stringlength = combinedchars.length();
		int count,combinedcharsindex;
		for(allcharacters='A';allcharacters<='z';allcharacters++)
		{
			count=0;
			for(combinedcharsindex=0;combinedcharsindex<stringlength;combinedcharsindex++)
			{
				eachcharacter = combinedchars.charAt(combinedcharsindex);
				if(eachcharacter==allcharacters)
				{
					count++;
				}
			}
			 if(count>0)
	            {
	                System.out.println("The character " + allcharacters + " has occurred for " + count + " times");
	            }
		}
	}

}
