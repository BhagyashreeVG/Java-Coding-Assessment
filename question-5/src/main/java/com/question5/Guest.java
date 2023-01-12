package com.question5;

public class Guest {
	private int guestId;
	private String name;
	private String city;
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "[guestId=" + guestId + ", name=" + name + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
