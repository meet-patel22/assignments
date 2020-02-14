package com.abstractfactory;

public class IPhone extends Phone
{
	private String ram;
	private String battery;
	
	public IPhone(String ram,String battery)
	{
		this.ram=ram;
		this.battery=battery;
		
	}
	public String getRam() 
	{
		return this.ram;
	}
	public String getBattery() 
	{
		return this.battery;
	}

	

}
