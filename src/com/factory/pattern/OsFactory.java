package com.factory.pattern;

public class OsFactory {
	
	public Os getInstance(String osType)
	{
		
		if(osType.equalsIgnoreCase(null))
		{
			return null;
		}
		if(osType.equalsIgnoreCase("mostInUse"))
		{
			return new Android();
		}
		else if(osType.equalsIgnoreCase("averageInUse"))
		{
			return new Ios();
		}
		else if(osType.equalsIgnoreCase("LessInUse"))
		{
			return new BlackBerry();
		}
		else
		{
			return new InvalidInput();
		}
		
	}
		
	}
	


