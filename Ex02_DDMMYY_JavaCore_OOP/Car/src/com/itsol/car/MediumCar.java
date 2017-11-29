package com.itsol.car;

public class MediumCar extends Car{
	private boolean havePowerSteering;
	private String path = "C:/Users/tranb/Downloads/ITSOL/mediumCar.txt";
	
	public void setHavePowerSteering(boolean havePowerSteering) {
		this.havePowerSteering = havePowerSteering;
	}
	public boolean getHavePowerSteering() {
		return havePowerSteering;
	}
	public String getPath() {
		return path;
	}
	public MediumCar() {
	}
	public MediumCar(int numberPlate, int yearOfManufactury, String brand, boolean haveInsurance, boolean havePowerSteering) {
		setNumberPlate(numberPlate);
		setYearOfManufactury(yearOfManufactury);
		setBrand(brand);
		setHaveInsurance(haveInsurance);
		setHavePowerSteering(havePowerSteering);
	}
	public String showInfoCar() {
		return getNumberPlate() + " " + getYearOfManufactury() + " " + getBrand() + " " + getHaveInsurance() + " " + getHavePowerSteering();
	}
}
