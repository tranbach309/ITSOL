package com.itsol.car;

public class Car {
	private int numberPlate;
	private int yearOfManufactury;
	private String brand;
	private boolean haveInsurance;
	private String path;
	
	public void setNumberPlate(int numberPlate) {
		this.numberPlate = numberPlate;
	}
	public void setYearOfManufactury(int yearOfManufactury) {
		this.yearOfManufactury = yearOfManufactury;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setHaveInsurance(boolean haveInsurance) {
		this.haveInsurance = haveInsurance;
	}
	public int getNumberPlate() {
		return numberPlate;
	}
	public int getYearOfManufactury() {
		return yearOfManufactury;
	}
	public String getBrand() {
		return brand;
	}
	public boolean getHaveInsurance() {
		return haveInsurance;
	}
	public String getPath(){
		return path;
	}
	
	public Car() {
		
	}
	public Car(int numberPlate, int yearOfManufactury, String brand, boolean haveInsurance) {
		this.numberPlate = numberPlate;
		this.yearOfManufactury = yearOfManufactury;
		this.brand = brand;
		this.haveInsurance = haveInsurance;
	}
	public String showInfoCar() {
		return "0";
	}
	
}
