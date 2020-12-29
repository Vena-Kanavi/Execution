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
		foodItems[3] = "Puliyogare";
		foodItems[4] = "Fried Rice";
		foodItems[5] = "Palak Panir";
		foodItems[6] = "Parota";
		foodItems[7] = "Chicken Biriyani";
		foodItems[8] = "Mudde huli";
		foodItems[9] = "Benne Dosa";

		HotelsInCity hotel = new HotelsInCity(5);

		HotelDTO dto = new HotelDTO("Ayodya", Location.JAINAGAR, foodItems);
		hotel.addHotel(dto);
		hotel.displayHotelInfo();

		
		HotelDTO dto2=new HotelDTO("Udupi", Location.MGROAD, foodItems);
		hotel.addHotel(dto2);
		hotel.displayHotelInfo();
		
		HotelDTO dto3=new HotelDTO("Brundavana", Location.JAINAGAR, foodItems);
		hotel.addHotel(dto3);
		hotel.displayHotelInfo();

		hotel.displayByName("Ayodya", Location.JAINAGAR);
		
		hotel.displayByName("Brundavana", Location.JAINAGAR);
		
		
		

	}

}
