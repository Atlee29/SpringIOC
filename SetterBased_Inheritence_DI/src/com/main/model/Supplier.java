package com.main.model;

import java.util.List;

public class Supplier {
	private int sId;
	private String sName;
	private long mobile;
	private List<String>cities;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Supplier [sId=" + sId + ", sName=" + sName + ", mobile=" + mobile + ", cities=" + cities + "]";
	}
	

}
