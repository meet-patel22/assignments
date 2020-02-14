package com.observer;

public class ObserverTestMain 
{
	public static void main(String args[])
	{
	  NewsPaper np = new NewsPaper();
      
	  Loan personalLoan = new Loan("Personal Loan", 12.5f,"Standard Charterd");
	  System.out.println(personalLoan.toString());

      personalLoan.registerObserver(np);
      personalLoan.setUpdatedinterest(3.5f);
      personalLoan.notifyObserver();
	}	
}
