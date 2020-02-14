package com.core.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	  
	String Reverse="";
	String Str="";
	System.out.println("enter the string:" );
	Scanner sc = new Scanner(System.in);
	
	 Str = sc.nextLine();
	 sc.close();
	 
	 for(int i=Str.length()-1;i>=0;i--)
	 {
		 Reverse = Reverse + Str.charAt(i);
		 
	 }
	if(!Str.equals(Reverse))
	{
		System.out.println("string is not palindrome ");
	}
	else
	{
		System.out.println("string is palindrome ");
	}

	}

}
