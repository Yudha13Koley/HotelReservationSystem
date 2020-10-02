package com.training.HotelReservation;

import com.training.hotel.Hotel;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelReservation {
	private List<Hotel> Hotels;
	public List<Calendar> BookingDays;
	public HotelReservation() {
		Hotels=new LinkedList<>();
		BookingDays=new LinkedList<>();
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
			h.setWeekendPricePerDay(sc.nextInt());
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
	public int bookHotelDates() {
		File obj=new File("D:\\study\\JavaOracle\\HotelReservationSystem\\inputs\\dateinputs.txt");
		try {
			Scanner sc=new Scanner(obj);
			SimpleDateFormat sdf=new SimpleDateFormat("ddMMMyyyy");
			while(sc.hasNext())
			{
			try {
				Date date=sdf.parse(sc.next());
				Calendar c=Calendar.getInstance();
				c.setTime(date);
				BookingDays.add(c);
			    } catch (ParseException e) {
			System.out.println("Invalid Type Input !");
			}
			}
			sc.close();
			} catch (FileNotFoundException e) {
			System.out.println("No Dates Found !");
		}
		return BookingDays.size();
	}
}
