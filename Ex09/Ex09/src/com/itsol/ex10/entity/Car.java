package com.itsol.ex10.entity;

public class Car {
	private String id;
	private String type;
	private String numberPlate;
	private int yearOfManufacture;
	private String brand;
	private boolean haveInsurance;
	private boolean havePositioningDevice;
	private boolean havePowerSteering;
	private int actionDuration;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public boolean isHavePositioningDevice() {
		return havePositioningDevice;
	}

	public void setHavePositioningDevice(boolean havePositioningDevice) {
		this.havePositioningDevice = havePositioningDevice;
	}
	public boolean isHavePowerSteering() {
		return havePowerSteering;
	}

	public void setHavePowerSteering(boolean havePowerSteering) {
		this.havePowerSteering = havePowerSteering;
	}
	public int getActionDuration() {
		return actionDuration;
	}

	public void setActionDuration(int actionDuration) {
		this.actionDuration = actionDuration;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isHaveInsurance() {
		return haveInsurance;
	}

	public void setHaveInsurance(boolean haveInsurance) {
		this.haveInsurance = haveInsurance;
	}
	public Car() {
		
	}
	public Car(String id, String type, String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance,
			boolean havePositioningDevice, boolean havePowerSteering, int actionDuration) {
		super();
		this.id = id;
		this.type = type;
		this.numberPlate = numberPlate;
		this.yearOfManufacture = yearOfManufacture;
		this.brand = brand;
		this.haveInsurance = haveInsurance;
		this.havePositioningDevice = havePositioningDevice;
		this.havePowerSteering = havePowerSteering;
		this.actionDuration = actionDuration;
	}
	@Override
	public String toString() {
		return "Car [numberPlate=" + numberPlate + ", yearOfManufacture=" + yearOfManufacture + ", brand=" + brand
				+ ", haveInsurance=" + haveInsurance + "]";
	}
	

}
