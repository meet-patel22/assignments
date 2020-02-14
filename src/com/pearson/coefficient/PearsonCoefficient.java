package com.pearson.coefficient;

public class PearsonCoefficient {

	public static void main(String[] args) 
	{	
		double arr1[]= {10,20,30,40,50};
		double arr2[]= {1,2,3,4,5};
	
		Calculate obj=new Calculate();
		double pearsonCoefficient=obj.resultforCoefficient(arr1,arr2);
		System.out.println("the PearsonCoefficient is : "+pearsonCoefficient);
	}
}
