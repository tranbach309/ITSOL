package com.itsol.ex07.entity;

public class ModernCar extends Car {
	private boolean havePositioningDevice;

	public boolean isHavePositioningDevice() {
		return havePositioningDevice;
	}

	public void setHavePositioningDevice(boolean havePositioningDevice) {
		this.havePositioningDevice = havePositioningDevice;
	}
	public ModernCar() {
		
	}
	public ModernCar(boolean havePositioningDevice) {
		super();
		this.havePositioningDevice = havePositioningDevice;
	}
	
}
