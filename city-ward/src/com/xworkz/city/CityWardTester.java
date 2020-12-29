package com.xworkz.city;

import com.xworkz.city.cityward.CityWard;
import com.xworkz.city.dto.CityWardDTO;

public class CityWardTester {

	public static void main(String[] args) {
		CityWard ward=new CityWard(50);
		
		 CityWardDTO dto=new CityWardDTO(3, WardName.KRPURAM, 50000,"Keshavapur","Vishalakshi");
		 ward.addWardInfo(dto);
		 ward.display();
		 
		 CityWardDTO dto2=new CityWardDTO(3, WardName.KRPURAM, 50000,"KRMarket","Aishwarya");
		 ward.addWardInfo(dto2);
		 ward.display();
		 
		 
		 
		 ward.displayByNameOrNumber(WardName.KRPURAM, 3);

	}

}
