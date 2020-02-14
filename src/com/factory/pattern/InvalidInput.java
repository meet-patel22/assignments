package com.factory.pattern;

 class InvalidInputException extends Exception {
	
	InvalidInputException(String s)
	{
		System.out.println(s);
	}
	
}
 public class InvalidInput implements Os{
	 
	 public void aboutOs()
	 
		{
		 try
		 {
			throw new InvalidInputException("entre valid input for operating system");
		 }
		 catch(InvalidInputException e)
		 {
			// e.getMessage();
			System.out.println(e);
		 }
	
}
}