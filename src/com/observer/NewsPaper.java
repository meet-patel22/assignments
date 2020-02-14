package com.observer;

public class NewsPaper implements Observer
{

	@Override
	public void update(float interest)
	{
	    System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
	}

	@Override
	public void updateNewInterest(float updatedinterest)
	{
		System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + updatedinterest);
		
	}
	
	
	
	
}
