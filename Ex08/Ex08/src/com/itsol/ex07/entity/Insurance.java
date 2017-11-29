package com.itsol.ex07.entity;

public class Insurance {
	private String id;
	private String packageType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Insurance(String id, String packageType) {
		this.id = id;
		this.packageType = packageType;
	}

}
