package com.capgemini.lab6.exercise2;
import java.util.*;
import java.io.*;
public class ReadAndWriteOfFile {
	public void contentsoffile()
	{
		try  
		{  
		File file=new File("D:\\01 Training\\Gaurav Vasasali\\Java Assignments\\Lab6_Excercise2.txt");    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;
		int i = 1;
		while((line=br.readLine())!=null)  
		{ 
		sb.append(i+" ");
		sb.append(line);      //appends line to string buffer  
		sb.append("\n");     //line feed 
		i++;
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  

	}

}
