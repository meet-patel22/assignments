package com.abstractfactory;

public class PhoneFactory 
{
		public static Phone getPhone(PhoneAbstractFacatory factory){
			return factory.createPhone();
		}
	}
	


