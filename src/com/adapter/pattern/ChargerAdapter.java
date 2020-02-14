package com.adapter.pattern;

public class ChargerAdapter implements Charger {
	
	AdvanceCharger advanceCharger;
	

	public ChargerAdapter(String chargeType) 
	{
		// TODO Auto-generated constructor stub

		if(chargeType.equalsIgnoreCase("typeC"))
		{
			advanceCharger =new TypeCCharger();
		}
		if(chargeType.equalsIgnoreCase("usbC"))
		{
			advanceCharger =new TypeCUsb();
		}
		
	}
	@Override
	public void charge(String chargeType, String mobileModel) {
		// TODO Auto-generated method stub
		
		if(chargeType.equalsIgnoreCase("typeC"))
		{
			advanceCharger.chargeTypeC(mobileModel);
		}
		
		if(chargeType.equalsIgnoreCase("usbC"))
		{
			advanceCharger.chargeUsbC(mobileModel);
		}
		
		
	}



}
