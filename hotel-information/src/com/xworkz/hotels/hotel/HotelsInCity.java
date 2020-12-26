package com.xworkz.hotels.hotel;

import com.xworkz.hotels.constants.Location;
import com.xworkz.hotels.dto.HotelDTO;
import com.xworkz.hotels.constants.HotelType;


public class HotelsInCity {
	private HotelType type;
	private String services;
	private HotelDTO[] hotelDto = new HotelDTO[20];
	private int currentIndex = 0;
/**
	public void addHotel(String name, Location location, String[] foodItems) {
		if (name != null && location != null && foodItems != null) {
			this.HotelDTO = new HotelDTO(name, location, foodItems);
			System.out.println("the hotel info is added");
			System.out.println("Hotel is " + Arrays.toString(this.hotelDto));

		}
		if (hotelDto == null) {
			System.out.println("can not add empty value");
		}

		else {
			System.out.println("can not add information");
		}
	}
*/
	public void addHotel(HotelDTO[] dto) {
		if (dto != null) {
			this.hotelDto = dto;
			System.out.println("hotel is added");
		} else {
			System.out.println("can not add hotel");
		}
	}

	public void hotelInfo(String name, String location, String[] foodItems) {
		System.out.println("invoked hotelinfo method");

		if (name != null && location != null && foodItems != null) {
			System.out.println("hotel information is accessible");
			System.out.println(name);
			System.out.println(location);
			System.out.println(foodItems);
		}
	}

	public void displayByName(String name, Location location) {
		if (name != null && location != null) {
			boolean found = false;
			for (int i = 0; i < this.hotelDto.length; i++) {
				HotelDTO reference = this.hotelDto[i];
				String localName = reference.getName();
				Location localLocation = reference.getLocation();
				if (name.equals(localLocation) && location.equals(localLocation)) {
					System.out.println(reference.getName());
					System.out.println(reference.getOwnerName());
					System.out.println(reference.getLocation());
					found = true;
				}
			}
			if (found == false) {

				System.out.println("hotel name and location not found");
			}
		}
	}

	public void addHotel(HotelDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
