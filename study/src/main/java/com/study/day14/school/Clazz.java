package com.study.day14.school;

public class Clazz {
	private String name; 
	private Integer unit; 
	private Integer price; 
	
	public Clazz() {
		
	}
	
	public Clazz(String name, Integer unit, Integer price) {
		this.name = name;
		this.unit = unit;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Clazz [name=" + name + ", unit=" + unit + ", price=" + price + "]";
	}
	
	
	
}
