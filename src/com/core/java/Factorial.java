package com.core.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		int Fact=1;
		
		if(Num==0 || Num==1)
		{
			System.out.println("Factorial : 1");
		}
		while(Num!=1)
		{
			Fact = Fact*Num;
			Num--;
		}
		
		System.out.println("Factorial :"+Fact);
	}

}
