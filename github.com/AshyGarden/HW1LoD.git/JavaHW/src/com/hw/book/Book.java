package com.hw.book;

import java.time.LocalDateTime;

public class Book {
	
	private String name;				//책 이름(국문)	
	private int price; 					//책 가격
	private String publiser;			//출판사
	private LocalDateTime addedTime; 	//입고시간

	public Book(String name, int price, String publiser, LocalDateTime addedTime) {
		this.name = name;
		this.price = price;
		this.publiser = publiser;
		this.addedTime = addedTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPubliser() {
		return publiser;
	}

	public void setPubliser(String publiser) {
		this.publiser = publiser;
	}

	public LocalDateTime getAddedTime() {
		return addedTime;
	}

	public void setAddedTime(LocalDateTime addedTime) {
		this.addedTime = addedTime;
	}

	@Override
	public String toString() {
		return "[이름: " + name + " /가격: " + price + "원 /출판사: " + publiser + " /사건시간: " + addedTime + "]";				
	}
	
}
