package com.abstractfactory;

public class AndroidFactory implements PhoneAbstractFacatory
{
	private String ram;
	private String battery;
	
	public AndroidFactory(String ram, String battery)
	{
		super();
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public Phone createPhone()
	{
			return new AndroidPhone(ram,battery);
	}

}
