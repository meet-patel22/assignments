package com.abstractfactory;

public class IPhoneFactory implements PhoneAbstractFacatory 
{
	private String ram;
	private String battery;

	public IPhoneFactory(String ram, String battery) 
	{
		super();
		this.ram = ram;
		this.battery = battery;
	}
	
	public Phone createPhone()
	{
		return new IPhone(ram,battery);
	}


}
