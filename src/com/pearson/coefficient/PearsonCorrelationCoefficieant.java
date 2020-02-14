package com.pearson.coefficient;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

    class Calculator{
  
	public double meanof_x(double x[])
	{	
		double total=0;
		
		for(int index=0;index<x.length;index++)
		{
		   total=total+x[index];
		}
		double mean_X=total/x.length;
		return mean_X;
	}
	 public double meanof_y(double y[])
	{
		double total=0;
		for(int index=0;index<y.length;index++)
		{
		   total=total+y[index];	
		}
		double mean_Y=total/y.length;
		return mean_Y;
	}
	public double[] x_sub_meanofx(double x[],double mean_X)
	{
		double temp[]=new double[x.length];
		//double temp1[]=new double[x.length];
		double numeratorvalue_X=0;
		for(int index=0;index<x.length;index++)
		{	
			temp[index]=x[index]-mean_X;
			
		}	
        return temp; 		
	}
	public double[] squareof_x_sub_meanofx(double temp[])
	{
		double squarearr1[]=new double[temp.length];
		for(int index=0;index<temp.length;index++)
		{
			squarearr1[index]=temp[index]*temp[index];
		}
		return squarearr1;
		
	}
	public double numeratorvalueof_squarearrx(double squarearrx[])
	{	
		double numeratorvalue_squarearrx=0;
		for(int index=0;index<squarearrx.length;index++)
		{  
			numeratorvalue_squarearrx=numeratorvalue_squarearrx+squarearrx[index];
		}
		return numeratorvalue_squarearrx;
	
	}	
	
	public double sqrtof_sqa_sub_meanofx(double numeratorvalue_squarearr1)
	{
		
		
		return Math.sqrt(numeratorvalue_squarearr1);
	}
	public double[] y_sub_meanofy(double y[],double mean_Y)
	{
		double temp1[]=new double[y.length];
		double numeratorvalue_Y=0;
		for(int index=0;index<y.length;index++)
		{	
			temp1[index]=y[index]-mean_Y;
			 // numeratorvalue_Y=numeratorvalue_Y+temp[index];
		}	
        return temp1; 		
	}
	public double[] square_y_sub_meanofy(double temp1[])
	{
		double squarearr2[]=new double[temp1.length];
		for(int index=0;index<temp1.length;index++)
		{
			squarearr2[index]=temp1[index]*temp1[index];
		}
		return squarearr2;
		
	}
	public double numeratorvalueof_squarearry(double squarearry[])
	{	
		double numeratorvalue_squarearry=0;
		for(int index=0;index<squarearry.length;index++)
		{  
			numeratorvalue_squarearry=numeratorvalue_squarearry+squarearry[index];
		}
		return numeratorvalue_squarearry;
	}
	

	public double[] multyplication(double numeratorvalue_meanX[],double numeratorvalue_meanY[])
	{	double mul[]=new double[numeratorvalue_meanX.length];
	   
		for(int index=0;index<numeratorvalue_meanX.length;index++)
		{
			mul[index]=numeratorvalue_meanX[index]*numeratorvalue_meanY[index];
			
     	}
	return mul;
		
	}
	public double numerator(double mul[])
	{   double numeratorvalue=0;
		for(int index=0;index<mul.length;index++)
		{  
			numeratorvalue=numeratorvalue+mul[index];
		}
		return numeratorvalue;
	}

	public double denominator(double numeratorvalue_squarearr1,double numeratorvalue_squarearr2 )
	{
		double denominatorvalue=0;
		denominatorvalue= numeratorvalue_squarearr1* numeratorvalue_squarearr2;
		
		return denominatorvalue;
	}	
	public double sqrtof_deno(double  denominatorvalue)
	{
		return Math.sqrt(denominatorvalue);
	}
	public double result(double numeratorvalue,double denominatorvalue)
	{
		double result=0;
		result=numeratorvalue/ denominatorvalue;
		return result;
	}
	
	
 }
class MyException extends Exception {
	MyException(String s)
	{
		System.out.println(s);
	}
	
}
public class PearsonCorrelationCoefficieant extends Calculator  {

	public static void main(String[] args)
	{
	
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of element:");
			int n=sc.nextInt();
			if(n<=1) {
			throw new MyException("enter int value:");
			}
			double x[]=new double[n];
			double y[]=new double[n];
			System.out.println("enter the element for array X:");
			for(int index=0;index<n;index++)
			{
				x[index]=sc.nextInt();
			}
			System.out.println("enter the element for array Y:");
			for(int index=0;index<n;index++)
			{
				y[index]=sc.nextInt();
			}
		
			Calculator c1=new Calculator();
		
		    double mean_X=c1.meanof_x(x);
		    double mean_Y=c1.meanof_y(y);
		    double numeratorvalue_Y=0;
			double numeratorvalue_X=0;
		
			System.out.println("mean of array x is :"+c1.meanof_x(x));
			System.out.println("mean of array y is :"+c1.meanof_y(y));
			double numeratorvalue_meanX[]=c1.x_sub_meanofx(x, mean_X);
			double numeratorvalue_meanY[]=c1.y_sub_meanofy(y, mean_Y);
			double numeratorarr[]=c1.multyplication(numeratorvalue_meanX, numeratorvalue_meanY);
			
			double numeratorvalue=c1.numerator(numeratorarr);
			System.out.println("array of (x-(meanof x)) :"+Arrays.toString(numeratorvalue_meanX));
			System.out.println("array of y-(meanof y)) :"+Arrays.toString(numeratorvalue_meanY));
			System.out.println("multiplication of array x & y is :"+Arrays.toString(numeratorarr));
			//System.out.println("numerator value is :"+numeratorvalue);
			double square_arrx[]=c1.squareof_x_sub_meanofx(numeratorvalue_meanX);
	        //double numeratorvalue_squarearr1[]=c1.numeratorvalueof_squarearr1();
			System.out.println("square of arrayxis :"+Arrays.toString( square_arrx));
			
			double square_arry[]=c1.square_y_sub_meanofy(numeratorvalue_meanY);
	        //double numeratorvalue_squarearr1[]=c1.numeratorvalueof_squarearr1();
			System.out.println("square of arrayyis :"+Arrays.toString( square_arry));
		   
			double numeratorvalue_squarearrx=c1.numeratorvalueof_squarearrx(square_arrx);
		    System.out.println("numeratorvalue of square arrayx is :"+numeratorvalue_squarearrx);
			double numeratorvalue_squarearry=c1.numeratorvalueof_squarearry(square_arry);
		    System.out.println("numeratorvalue of square arrayy is :"+numeratorvalue_squarearry);
		 
		 
		    double denominator_value=c1.denominator(numeratorvalue_squarearrx,numeratorvalue_squarearry );
		    System.out.println("denominator value :"+denominator_value);  
		    double deno_value=c1.sqrtof_deno( denominator_value);
		    System.out.println("numerator value is :"+numeratorvalue);
		    System.out.println("denominator value after sqrt:"+c1.sqrtof_deno( denominator_value));
		    double result_final=c1.result(numeratorvalue,deno_value);
		    System.out.println("result is :"+ result_final);

		
		}
		catch(MyException e){
			System.out.println(e);
			
		}
	
	
	}
}
