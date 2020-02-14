package com.core.java;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		int arr[]={1,2,2,2,2,3,5,8,8,9};
		
		
		int len = arr.length;
	
		int temp[]=new int[arr.length];
        int i,k,j=0;
        
		
		for(i=0;i<len-1;i++)
		{
			if(arr[i] != arr[i+1]);
			{
				temp[j++] = arr[i];
				//j++;
			}
			
		}
	        temp[j++] = arr[len-1];
		
	
		for(k=0;k<j;k++) 
		{
			System.out.println(temp[k]+"");
		}
		
	}

}
