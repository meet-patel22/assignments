package com.adapter.pattern;

public class IosCharger implements Charger
{
	ChargerAdapter chargerAdapter;

	@Override
	public void charge(String chargeType, String mobileModel) 
	{
		if(chargeType.equalsIgnoreCase("iostype"))
		{
			System.out.println("charging using iosType charger "+  mobileModel  +" mobile");
		}
		else if(chargeType.equalsIgnoreCase("typeC") || chargeType.equalsIgnoreCase("usbC") )
		{
			
			chargerAdapter =new ChargerAdapter(chargeType);
			chargerAdapter.charge(chargeType, mobileModel);
		}
		else
		{
			   System.out.println("Invalid chargerType " + mobileModel + " format not supported");
		}
		
	}
	
}
