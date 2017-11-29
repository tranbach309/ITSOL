package com.itsol.car;

public class OldCar extends Car{
	private int actionDuration;
	private String path = "C:/Users/tranb/Downloads/ITSOL/oldCar.txt";
	
	public void setActionDuration(int actionDuration) {
		this.actionDuration = actionDuration;
	}
	public int getActionDuration() {
		return actionDuration;
	}
	public String getPath() {
		return path;
	}
	public OldCar(int numberPlate, int yearOfManufactury, String brand, boolean haveInsurance, int actionDuration) {
		setNumberPlate(numberPlate);
		setYearOfManufactury(yearOfManufactury);
		setBrand(brand);
		setHaveInsurance(haveInsurance);
		setActionDuration(actionDuration);
	}
	public String showInfoCar() {
		return getNumberPlate() + " " + getYearOfManufactury() + " " + getBrand() + " " + getHaveInsurance() + " " + getActionDuration();
	}
}
