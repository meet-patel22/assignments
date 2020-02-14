package com.core.java;


public class IterateArray 
{

	public static void main(String[] args) 
	{
		
		int arr[] = {12,25,30,61};
		int len = arr.length;
		int num;
				
		
		for(int i=0;i<=len-1;i++)
		{
			num = arr[i];
			if(num%3==0 || num%5==0 || num%7==0) 
			{
				System.out.println(num+"");
			}
			
		}

	}

}
