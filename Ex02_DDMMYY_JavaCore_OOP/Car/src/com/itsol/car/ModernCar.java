package com.itsol.car;

public class ModernCar extends Car{
	private boolean havePositioningDevice;
	private String path = "C:/Users/tranb/Downloads/ITSOL/modernCar.txt";
	
	public void setHavePositioningDevice(boolean havePositioningDevice) {
		this.havePositioningDevice = havePositioningDevice;
	}
	public boolean getHavePositioningDevice() {
		return havePositioningDevice;
	}
	public String getPath() {
		return path;
	}
	public ModernCar() {
	}
	public ModernCar(int numberPlate, int yearOfManufactury, String brand, boolean haveInsurance, boolean havePositioningDevice) {
		setNumberPlate(numberPlate);
		setYearOfManufactury(yearOfManufactury);
		setBrand(brand);
		setHaveInsurance(haveInsurance);
		this.havePositioningDevice = havePositioningDevice;
	}
	public String showInfoCar() {
		return getNumberPlate() + " " + getYearOfManufactury() + " " + getBrand() + " " + getHaveInsurance() + " " + getHavePositioningDevice();
	}
	
}	
