package com.study.day26;

public class Person {
	private String name;
	private Double h;
	private Double w;
	private Double bmi;
	
	public Person() {
		
	}
	
	public Person(String name, Double h, Double w) {
		this.name = name;
		this.h = h;
		this.w = w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getH() {
		return h;
	}

	public void setH(Double h) {
		this.h = h;
	}

	public Double getW() {
		return w;
	}

	public void setW(Double w) {
		this.w = w;
	}

	public Double getBmi() {
		return bmi;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", h=" + h + ", w=" + w + ", bmi=" + bmi + "]";
	}
	
	
	
}
