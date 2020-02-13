package com.capgemini.lab3.exercise3;

public class Excercise3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,541,58,73,20,47};
		GetSortedFun object = new  GetSortedFun();
		 object.getSorted(arr);
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }

	}

}
