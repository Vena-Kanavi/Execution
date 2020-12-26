package com.xworkz.hotels.dto;

import com.xworkz.hotels.constants.Location;

public class HotelDTO {
	private String name;
	private Location location;
	private String ownerName;
	private String[] foodItems;

	/**
	 * @param name
	 * @param ownerName
	 */
	public HotelDTO(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	/**
	 * @param name
	 * @param location
	 */
	public HotelDTO(String name, Location location, String[] foodItems) {
		super();
		this.name = name;
		this.location = location;
		this.foodItems = foodItems;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
