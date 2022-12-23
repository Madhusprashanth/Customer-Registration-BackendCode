package com.example.Validation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
		private int HouseNo;
		private String area;
		private int pincode;
		private String district;
		public int getHouseNo() {
			return HouseNo;
		}
		public void setHouseNo(int houseNo) {
			HouseNo = houseNo;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		

		public Address() {
			
		}
		
		
		
		public Address(int houseNo, String area, int pincode, String district) {
			super();
			HouseNo = houseNo;
			this.area = area;
			this.pincode = pincode;
			this.district = district;
		}
		
		
}
