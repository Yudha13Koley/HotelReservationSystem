package com.training.main;

import java.util.Scanner;
import com.training.HotelReservation.HotelReservation;


public class HotelReservationMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ! ");
		Scanner sc=new Scanner(System.in);
		while (true){
		System.out.println("Enter Customer Type  :");
		String str=sc.next();
		if(str.equalsIgnoreCase("reward")||str.equalsIgnoreCase("regular"))
		{
		HotelReservation h1=new HotelReservation(str);
		h1.addHotels();
		h1.bookHotelDates();
		h1.findCheapestGoodRatedHotel();
		break;
		}
		System.out.println("Enter Valid Customer Type :");
		}
		sc.close();
	}		
	}
