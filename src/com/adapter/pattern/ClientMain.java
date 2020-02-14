package com.adapter.pattern;

public class ClientMain
{
  public static void main(String[] args)
  {
	  //ENTER CHARGE TYPE usbC,typeC,iosType
	  
	  
	  IosCharger iosCharger=new IosCharger();
	   
	  iosCharger.charge("usbC","nokia");
		
  }
		
}
