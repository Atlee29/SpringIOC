package com.main.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<Integer> rollNO;
	private List<Department> ldep;
	private Set<String> name;
	private Map<Integer,String> city;
	private Map<Integer,Department> dm;
	
	public Map<Integer, Department> getDm() {
		return dm;
	}
	public void setDm(Map<Integer, Department> dm) {
		this.dm = dm;
	}
	public List<Department> getLdep() {
		return ldep;
	}
	public void setLdep(List<Department> ldep) {
		this.ldep = ldep;
	}
	public List<Integer> getRollNO() {
		return rollNO;
	}
	public void setRollNO(List<Integer> rollNO) {
		this.rollNO = rollNO;
	}
	public Set<String> getName() {
		return name;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public Map<Integer, String> getCity() {
		return city;
	}
	public void setCity(Map<Integer, String> city) {
		this.city = city;
	}
	
	
}
