package com.tom;

public class Temperature {
	double celsius;
	
	public Temperature(int celsius){
		this.celsius = celsius;
	}
	
	public double fahrenheit(){
		double f = celsius * (9/5.0) + 32;
		return f;
	}
	
	
	
	}


