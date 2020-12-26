package com.xworkz.hotels;

import com.xworkz.hotels.constants.Location;
import com.xworkz.hotels.dto.HotelDTO;

import com.xworkz.hotels.hotel.HotelsInCity;

public class HotelTester {

	public static void main(String[] args) {
		String[] foodItems = new String[10];
		foodItems[0] = "Idli";
		foodItems[1] = "Biriyani";
		foodItems[2] = "Dosa";

		HotelsInCity city = new HotelsInCity();
		HotelDTO dto = new HotelDTO("Ayodya", Location.JAINAGAR, foodItems);
		city.addHotel(dto);

		city.displayByName("Ayodya", Location.JAINAGAR);

	}

}
