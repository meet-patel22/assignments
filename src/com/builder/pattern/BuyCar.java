package com.builder.pattern;

public class BuyCar 
{
	public static void main(String args[])
	{
		Car car=new CarBuilder().setCarColour("blue").setCarCompany("hyundai").getCar();
		System.out.println(car);
	}

}
