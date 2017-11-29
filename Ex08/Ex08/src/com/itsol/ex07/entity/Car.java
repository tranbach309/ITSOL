package com.itsol.ex07.entity;

public class Car {
	private String id;
	private String numberPlate;
	private int yearOfManufacture;
	private String brand;
	boolean haveInsurance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public Car() {
		
	}
	public Car(String id, String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
		super();
		this.id = id;
		this.numberPlate = numberPlate;
		this.yearOfManufacture = yearOfManufacture;
		this.brand = brand;
		this.haveInsurance = haveInsurance;
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
	@Override
	public String toString() {
		return "Car [numberPlate=" + numberPlate + ", yearOfManufacture=" + yearOfManufacture + ", brand=" + brand
				+ ", haveInsurance=" + haveInsurance + "]";
	}
	

}
