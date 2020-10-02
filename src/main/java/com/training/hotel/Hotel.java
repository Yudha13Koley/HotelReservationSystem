package com.training.hotel;

public class Hotel {

	private String Name;
	private int NormalPricePerDay;
	private int WeekendPricePerDay;
	private int SpecialNormalPricePerDay;
	private int SpecialWeekendPricePerDay;
	private int Rating;
	
	public int getSpecialNormalPricePerDay() {
		return SpecialNormalPricePerDay;
	}
	public void setSpecialNormalPricePerDay(int specialNormalPricePerDay) {
		SpecialNormalPricePerDay = specialNormalPricePerDay;
	}
	public int getSpecialWeekendPricePerDay() {
		return SpecialWeekendPricePerDay;
	}
	public void setSpecialWeekendPricePerDay(int specialWeekendPricePerDay) {
		SpecialWeekendPricePerDay = specialWeekendPricePerDay;
	}
	
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
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
	public int calculateTotalChargeForSpecial(int normaldays,int weekenddays) {
		return (SpecialNormalPricePerDay*normaldays+SpecialWeekendPricePerDay*weekenddays);
	}
	@Override
	public String toString() {
		return "Hotel [Name=" + Name + ", NormalPricePerDay=" + NormalPricePerDay + ", WeekendPricePerDay="
				+ WeekendPricePerDay + ", SpecialNormalPricePerDay=" + SpecialNormalPricePerDay
				+ ", SpecialWeekendPricePerDay=" + SpecialWeekendPricePerDay + ", Rating=" + Rating + "]";
	}
	

	
}
