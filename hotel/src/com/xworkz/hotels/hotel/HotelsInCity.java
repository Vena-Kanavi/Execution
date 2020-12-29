package com.xworkz.hotels.hotel;

import java.util.Arrays;

import com.xworkz.hotels.constants.HotelType;
import com.xworkz.hotels.constants.Location;
import com.xworkz.hotels.dto.HotelDTO;

public class HotelsInCity {
	private HotelDTO[] hotelDTO;
	private String services;
	private HotelType hotelType;
	private int currentIndex = 0;

	public HotelsInCity(int size) {
		hotelDTO = new HotelDTO[size];
	}

	public void addHotel(HotelDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("current index : " + this.currentIndex);
			System.out.println("accepting hotel info");
			this.hotelDTO[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("we cannot accept hotel info ");
			}
			if (dto != null) {
				System.out.println("cannot add more hotel information, total  " + this.currentIndex);
			}
			System.out.println("current index : " + this.currentIndex);
		}
	}

	public void displayByName(String name, Location location) {
		if (name != null && location != null) {
			System.out.println("Display by name and location");
			boolean start = false;
			for (int i = 0; i < this.hotelDTO.length; i++) {
				HotelDTO ref = this.hotelDTO[i];
				if (ref != null) {
					String localstart = ref.getName();
					Location locallocation = ref.getLocation();
					if (name.equals(localstart) && location.equals(locallocation)) {
						start = true;
						System.out.println("Hotel name is  " + ref.getName());
						System.out.println(ref.getLocation());

						// break;
					}
				}
			}

			if (start == false) {
				System.out.println("name and location not found");

			}
		}

	}

	public void displayHotelInfo() {
		for (int i = 0; i < this.hotelDTO.length; i++) {
			HotelDTO dto = this.hotelDTO[i];
			if (dto != null) {
				System.out.println("displaying all hotel information");
				System.out.println("hotel name is " + dto.getName());
				System.out.println("owner name is " + dto.getOwnerName());
				System.out.println("location is " + dto.getLocation());
				System.out.println("food items are " + Arrays.toString(dto.getFoodItems()));
				System.out.println("******************************************");
			}
		}
	}

	public void displayOwnerName(String name) {
		if (name != null) {
			boolean start = false;
			for (int index = 0; index < this.hotelDTO.length; index++) {
				if (this.hotelDTO[index] != null) {
					start = true;
					HotelDTO refOfstart = this.hotelDTO[index];
					String localName = refOfstart.getName();
					if (name.equals(localName)) {
						System.out.println("owner name is" + refOfstart.getOwnerName());
						System.out.println("hotel name is "+refOfstart.getName());
						// break;
					}
				}
			}
			if (start == false)
				System.out.println("owner name is not found");
		}

	}
}
