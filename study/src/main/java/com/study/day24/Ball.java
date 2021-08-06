package com.study.day24;

public class Ball { // data class
	private String color;
	private int price;
	
	public Ball() {
		
	}

	public Ball(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 顏色與價格一樣視為相同
		Ball b2 = (Ball)obj;
		if(price == b2.price && color.equals(b2.color)) {
			return true;
		} else {
			return false;
		}
		
	}
	

	@Override
	public int hashCode() {
		return 7 * 11 * price + color.hashCode();
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}
	
}
