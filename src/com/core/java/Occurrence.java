package com.core.java;

public class Occurrence {

	public static void main(String[] args) 
	{
		String s = "aabbcd";
	    char[] c =s.toCharArray();
	    int len = c.length;
	    int count=0;
	    int i,j;
	    for(i=0;i<=len-1;i++)
	    {          count=0;
	    	for(j=0;j<=len-1;j++)
	    	{
	    		if(j < i && c[i] == c[j]) 
	    		{
	    			break;
	    		}
	    		
	    		if(c[j]==c[i])
	    		{
	    			count++;
	    	    }
	    		
	    		if(j == len-1)
	    		{
	    			System.out.println("character: " +c[i]+ " is present " +count+ " times");
	    		}
	    	}
	    }

	}

}
