package com.core.java;

public class SplitArray {

	public static void main(String[] args)
	{
		int arr[]= {1,2,1,3,4,3,2};
		int divide=((arr.length)+1)/2;
		int arr1[]=new int[(arr.length/2)+1];
		System.out.println("Array1:");
		for(int i=0;i<divide;i++)
		{
			arr1[i]=arr[i];
		}
		
		for(int i=0;i<divide;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println();
		
		int arr2[]=new int[(arr.length)];
		System.out.println("Array2:");
		for(int i=divide;i<arr.length;i++)
		{
			arr2[i]=arr[i];
			
		}
		for(int i=divide;i<arr.length;i++)
		{
			System.out.println(arr2[i]+" ");
		}
	

	}

}
