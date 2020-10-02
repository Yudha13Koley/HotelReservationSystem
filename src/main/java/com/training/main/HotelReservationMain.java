package com.training.main;

import com.training.HotelReservation.HotelReservation;

public class HotelReservationMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ! ");
		HotelReservation h1=new HotelReservation();
		h1.addHotels();
		h1.bookHotelDates();
		h1.findBestRatedHotel();
		h1.printHotels();
	}		
	}
