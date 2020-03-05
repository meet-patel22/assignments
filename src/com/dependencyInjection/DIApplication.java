package com.dependencyInjection;

public class DIApplication implements Consumer
{
	private DrawShapeService service;
	
	public DIApplication(DrawShapeService service)
	{
		this.service=service;
	}

	@Override
	public void processDraw()
	{
		this.service.DrawShape();
		
	}
	
}
