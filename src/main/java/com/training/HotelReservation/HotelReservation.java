package com.training.HotelReservation;

import java.util.LinkedList;
import com.training.hotel.Hotel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HotelReservation {
	private List<Hotel> Hotels;
	public HotelReservation() {
		Hotels=new LinkedList<>();
	}
	public void addHotels() {
		System.out.println("Reading Inputs From A File : ");
		File obj=new File("D:\\study\\JavaOracle\\HotelReservationSystem\\inputs\\inputs.txt");
		try {
			Scanner sc=new Scanner(obj);
			while(sc.hasNext()) {
			Hotel h=new Hotel();
			h.setName(sc.next());
			h.setNormalPricePerDay(sc.nextInt());
			Hotels.add(h);
			}
            sc.close();
			} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found !");
		}
	}
	public void printHotels() {
		if(Hotels.size()==0)
			System.out.println("No Hotels Present !");
		else
		{
			Hotels.stream().forEach(n->{System.out.println(n);});
		}
	}

}
