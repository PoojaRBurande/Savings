package com.savings.beans;

import org.springframework.stereotype.Component;

@Component
public class EmpAddress {
	String cityName;
	String pinCode;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "EmpAddress [cityName=" + cityName + ", pinCode=" + pinCode
				+ "]";
	}
	
}
