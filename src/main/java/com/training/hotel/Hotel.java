package com.training.hotel;

public class Hotel {

	private String Name;
	private int NormalPricePerDay;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNormalPricePerDay() {
		return NormalPricePerDay;
	}
	public void setNormalPricePerDay(int normalPricePerDay) {
		NormalPricePerDay = normalPricePerDay;
	}
	@Override
	public String toString() {
		return "Hotel [Name=" + Name + ", NormalPricePerDay=" + NormalPricePerDay + "]";
	}
	
}
