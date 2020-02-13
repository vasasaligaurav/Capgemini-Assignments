package com.cagemini.lab8.exercise1;
import java.io.File;
import java.util.*;

public class Excercise1FileProgram extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan=new Scanner(System.in);
	   System.out.println("Enter Source File:");
	   String source=scan.nextLine();
	   System.out.println("Enter Target File:");
	   String target=scan.nextLine();
	   File sourcefile=new File(source);
	   File targetfile=new File(target);
	     if(sourcefile.exists() && targetfile.exists())
	     {
	     CopyDataThread cdt=new CopyDataThread(sourcefile,targetfile);
	     cdt.start();
	     }
	     else if(!sourcefile.exists())
	    	 System.out.println("Source file does not exits");
	     else if(!targetfile.exists())
	    	 System.out.println("Target file does not exits !!");
	    
	     scan.close();
		}

	}


