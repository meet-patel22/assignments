package com.core.java;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		int alpha=65;
		
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+"");
			
			}
			System.out.println();
		}
		for(i=0;i<=5;i++)
		{
			for(j=0;j<=3-i;j++)
			{
				System.out.print((char)(alpha+j)+"");
			}
			System.out.println();
		}

	}

}
