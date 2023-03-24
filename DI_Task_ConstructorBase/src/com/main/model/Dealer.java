package com.main.model;

public class Dealer {
private int dealerId;
private String dealerName;
private long dealerMob;

public Dealer(int dealerId, String dealerName, long dealerMob) {
	super();
	this.dealerId = dealerId;
	this.dealerName = dealerName;
	this.dealerMob = dealerMob;
}

@Override
public String toString() {
	return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerMob=" + dealerMob + "]";
}


}
