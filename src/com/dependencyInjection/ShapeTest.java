package com.dependencyInjection;

public class ShapeTest 
{
	public static void main(String args[])
	{
		DrawShapeServiceInjector injector;
		
		Consumer app;
		
		injector=new TriangleServiceInjector();
		app=injector.getConsumer();
		app.processDraw();
		
		injector=new CircleServiceInjector();
		app=injector.getConsumer();
		app.processDraw();
		
	}
}
