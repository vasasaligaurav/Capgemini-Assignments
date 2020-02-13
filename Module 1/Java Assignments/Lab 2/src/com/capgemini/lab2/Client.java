package com.capgemini.lab2;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("1.Book\n2.Journal Articles\n3.Video\n4.Cd's");
		System.out.println("Enter your choice:");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		switch(choice)
		{
		case 1:
		{
			Book object1 = new Book();
			object1.print();
			break;
		}
		case 2:
		{
			Journal object2 = new Journal();
			object2.print();
			break;
		}
		case 3:
		{
			Video object3 = new Video();
			object3.print();
			break;
		}
		case 4:
		{
			Cd object4 = new Cd();
			object4.print();
			break;
		}
		default:
		{
			System.out.println("Please Enter the correct option");
			break;
			
		}
		}

	}

}
