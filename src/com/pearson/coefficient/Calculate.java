package com.pearson.coefficient;

public class Calculate {
	
	public double sumOfArrayElement(double input[])
	{	
		double SUM=0;
		for(double index:input)
		{
			SUM=SUM+index;
		}
		return SUM;
	}
	public double meanOf(double input[])
	{	
		double mean=sumOfArrayElement(input)/input.length;
		return mean;
	}
	public double[] deviationArray(double input[] )
	{
		double[] deviation=new double[input.length];
    /*  for(double index:input)
		{
			deviation=index-meanOf(input);
		}
	*/	for(int index=0;index<input.length;index++)
		{	
			deviation[index]=input[index]-meanOf(input);
		}
		return deviation; 	
	}
	public double[] productOfArray(double input1[],double input2[])
	{
		double productarray[]=new double[input1.length];
		for(int index=0;index<input1.length;index++)
		{
			productarray[index]=input1[index]*input2[index];
		}
		return productarray;
	}
	public double[] squareOfArray(double input[])
	{	double temp[]=deviationArray(input);
		double squareArray[]=new double[input.length];
		for(int index=0;index<input.length;index++)
		{
			squareArray[index]=temp[index]*temp[index];
		}
		return squareArray;
	}
	
	public double sqrtOf(double input)
	{
		return Math.sqrt(input);
	}
	public double resultforCoefficient(double []input1,double []input2)
	{
		double numeratorValue=sumOfArrayElement(productOfArray(deviationArray(input1),deviationArray(input2)));
		
	    double sqrt1=sqrtOf(sumOfArrayElement(squareOfArray(deviationArray(input1))));
	    double sqrt2=sqrtOf(sumOfArrayElement(squareOfArray(deviationArray(input2))));
	    
	    double denominatorValue=sqrt1*sqrt2;
	    
	    double pearsonCoefficientValue=numeratorValue/denominatorValue;
	    return pearsonCoefficientValue;
	}	
}
