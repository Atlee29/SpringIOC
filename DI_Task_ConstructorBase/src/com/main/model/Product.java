package com.main.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int pId;
	private String pName;
	private float pPrice;
	private List<Dealer> ld;
	private Map<Integer,Supplier> ms;
	public Product(int pId, String pName, float pPrice, List<Dealer> ld, Map<Integer, Supplier> ms) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.ld = ld;
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", ld=" + ld + ", ms=" + ms + "]";
	}
	
	

}
