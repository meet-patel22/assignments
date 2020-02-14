package com.abstractfactory;

 public abstract class Phone
 {
	 public abstract String getRam();
	 public abstract String getBattery();
	@Override
	public String toString() {
		return "Ram :" + getRam() + ", Battery :" + getBattery()  ;
	}
	  
	 

}
