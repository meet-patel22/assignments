package com.builder.pattern;

public class CarBuilder
{
	
	private String carCompany;
	private String carType;
	private String carColour;
	private String carTransmission;
	
	public CarBuilder setCarCompany(String carCompany) 
	{
		this.carCompany = carCompany;
		return this;
	}
	public CarBuilder setCarType(String carType)
	{
		this.carType = carType;
		return this;
	}
	public CarBuilder setCarColour(String carColour)
	{
		this.carColour = carColour;
		return this;
	}
	public CarBuilder setCarTransmission(String carTransmission)
	{
		this.carTransmission = carTransmission;
		return this;
	}
	
	public Car getCar()
	{
		return new Car(carCompany, carType, carColour, carTransmission);
	}

}
