package com.dependencyInjection;

public class TriangleServiceInjector implements DrawShapeServiceInjector
{

	@Override
	public Consumer getConsumer()
	{
		// TODO Auto-generated method stub
		return new DIApplication(new DrawTriangleImpl());
	}
	
}
