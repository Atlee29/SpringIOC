package com.main.model;

public class Student {
	private int rollno;
	private String name;
	
	private Address addr;
	
	
	public Address getAddr() {
		return addr;
	}
	public Student(Address addr) {
		super();
		this.addr = addr;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
