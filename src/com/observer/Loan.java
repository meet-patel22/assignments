package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject 
{
	
	private List<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;
    private float updatedinterest;
    
	
	public Loan( String type, float interest, String bank)
	{
		super();
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}
	
	@Override
	public String toString() {
		return "Loan [type=" + type + ", interest=" + interest + ", bank=" + bank + "]";
	}

	public float getUpdatedinterest()
	{
		return updatedinterest;
	}
	
	public void setUpdatedinterest(float updatedinterest) 
	{
		this.updatedinterest = updatedinterest;
	}
	
	@Override
	public void registerObserver(Observer observer)
	{
	observers.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
		
	}
	@Override
	public void notifyObserver() 
	{
	  for (Observer ob : observers)
	  {
      System.out.println("Notifying Observers on change in Loan interest rate");
  
      ob.updateNewInterest(this.updatedinterest);
      }
	}
	
	

}
