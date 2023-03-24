package com.main.model;

import java.util.List;

public class Supplier {
	private int supId;
	private String subName;
	private long supMob;
	private List<String> cities;
	
	public Supplier(int supId, String subName, long supMob, List<String> cities) {
		super();
		this.supId = supId;
		this.subName = subName;
		this.supMob = supMob;
		this.cities = cities;
	}



	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", subName=" + subName + ", supMob=" + supMob + ", cities=" + cities + "]";
	}
	
	

}
