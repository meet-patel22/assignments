package com.builder.pattern;

public class Car {
	
	private String carCompany;
	private String carType;
	private String carColour;
	private String carTransmission;
	
	public Car(String carCompany, String carType, String carColour, String carTransmission) {
		super();
		this.carCompany = carCompany;
		this.carType = carType;
		this.carColour = carColour;
		this.carTransmission = carTransmission;
	}

	@Override
	public String toString() {
		return "Car [carCompany=" + carCompany + ", carType=" + carType + ", carColour=" + carColour
				+ ", carTransmission=" + carTransmission + "]";
	}
	
	

}
