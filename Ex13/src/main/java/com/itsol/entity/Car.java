package com.itsol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "NUMBER_PLATE")
	private String numberPlate;
	@Column(name = "YEAR_OF_MANUFACTURE")
	private int yearOfManufacture;
	@Column(name = "BRAND")
	private String brand;
	@Column(name = "HAVE_INSURANCE")
	private boolean haveInsurance;
	@Column(name = "HAVE_POSITIONING_DEVICE")
	private boolean havePositioningDevice;
	@Column(name = "HAVE_POWER_STEERING")
	private boolean havePowerSteering;
	@Column(name = "ACTION_DURATION")
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
