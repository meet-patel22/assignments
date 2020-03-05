package com.dependencyInjection;

public class DrawTriangleImpl implements DrawShapeService
{

	@Override
	public void DrawShape()
	{
		System.out.println("drawing the shape triangle:");
	}
	

}
