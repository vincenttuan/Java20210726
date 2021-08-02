package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class Combo {
	private LinkedHashSet<Drink> drinks = new LinkedHashSet<>();
	private LinkedHashSet<Dessert> desserts = new LinkedHashSet<>();
	private double discount;
	
	public Combo() {
		
	}
	
	public Combo(LinkedHashSet<Drink> drinks, LinkedHashSet<Dessert> desserts, double discount) {
		this.drinks = drinks;
		this.desserts = desserts;
		this.discount = discount;
	}

	public LinkedHashSet<Drink> getDrinks() {
		return drinks;
	}

	public void setDrinks(LinkedHashSet<Drink> drinks) {
		this.drinks = drinks;
	}

	public LinkedHashSet<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(LinkedHashSet<Dessert> desserts) {
		this.desserts = desserts;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Combo [drinks=" + drinks + ", desserts=" + desserts + ", discount=" + discount + "]";
	}
	
	
	
}
