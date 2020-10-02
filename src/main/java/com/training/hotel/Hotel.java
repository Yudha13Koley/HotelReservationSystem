package com.training.hotel;

public class Hotel {

	private String Name;
	private int NormalPricePerDay;
	private int WeekendPricePerDay;
	
	public int getWeekendPricePerDay() {
		return WeekendPricePerDay;
	}
	public void setWeekendPricePerDay(int weekendPricePerDay) {
		WeekendPricePerDay = weekendPricePerDay;
	}
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
	public int calculateTotalCharge(int normaldays,int weekenddays) {
		return (NormalPricePerDay*normaldays+WeekendPricePerDay*weekenddays);
	}
	@Override
	public String toString() {
		return "Hotel [Name=" + Name + ", NormalPricePerDay=" + NormalPricePerDay + ", WeekendPricePerDay="
				+ WeekendPricePerDay + "]";
	}

	
}
