package com.dependencyInjection;

public class DrawCircleImpl implements DrawShapeService 
{

	@Override
	public void DrawShape() 
	{
		System.out.println("drawing the shape circle :");
	}

	
}
