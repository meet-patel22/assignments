package com.abstractfactory;

import java.util.Scanner;

public class ClientMain
{
	public static void main(String args[])
	{	
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your phonr type:");
		String phoneType=scanner.next();
		
		
		Phone android =PhoneFactory.getPhone(new AndroidFactory("2gb", "3000mAh"));
		Phone iPhone=PhoneFactory.getPhone(new IPhoneFactory("3gb", "4000mAh"));
		if(phoneType.equalsIgnoreCase("android"))
		{
			System.out.println("your phone type is--> " +phoneType+ "  and feature is-->"+android);
		}
		else if(phoneType.equalsIgnoreCase("iphone"))
		{
			System.out.println("your phone type is-->"  +phoneType+  "  and feature is-->"+iPhone);
		}
		else
		{
			System.out.println("your phone type is invalid-->"  +phoneType);
		}
		scanner.close();
	}

}
