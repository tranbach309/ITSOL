package com.itsol.ex07.entity;

public class Insurance {
	private int id;
	private String packageType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Insurance() {
		
	}
	public Insurance(int id, String packageType) {
		this.id = id;
		this.packageType = packageType;
	}

}
