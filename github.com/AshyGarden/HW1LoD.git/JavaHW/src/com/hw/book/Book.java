package com.hw.book;

import java.time.LocalDateTime;

public class Book {
	
	private String name;				//책 이름(원본)
	private String nameKr;				//책 이름(국문)	
	private int price; 					//책 가격
	private String publiser;			//출판사
	private LocalDateTime addedTime; 	//입고시간

	public Book(String name, String nameKr, int price, String publiser, LocalDateTime addedTime) {
		super();
		this.name = name;
		this.nameKr = nameKr;
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

	public String getNameKr() {
		return nameKr;
	}

	public void setNameKr(String nameKr) {
		this.nameKr = nameKr;
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
		return "[이름(원본): " + name + " / 이름(국문): " + name + " /가격: " + price + "\n 출판사: " + publiser + " / 입고시간: " + addedTime + "]";
	}
	
}
