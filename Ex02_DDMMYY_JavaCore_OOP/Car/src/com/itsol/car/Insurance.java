package com.itsol.car;

public class Insurance {
	private int index;
	private String type;
	private String path = "C:/Users/tranb/Downloads/ITSOL/insurance.txt";
	
	//public void setIndex(int index)
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public String getPath() {
		return path;
	}
	public Insurance() {
		
	}
	public Insurance(String type) {
		this.type = type;
	}
}
