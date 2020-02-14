package com.core.java;
import java.util.*;

class DenominatorZeroException extends Exception
{
	DenominatorZeroException(String s)
	{
		System.out.println(s);
	}
	
}
public class DivideByZero {

	public static void main(String[] args) {
		
		int num1=10 ,num2=1;
		int result = num1/num2 ;
		try
		{
			if(num2==0)
			{
				throw new DenominatorZeroException("denominator can't be Zero");

			}
			else
			{
				System.out.println("output is:"+result);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
