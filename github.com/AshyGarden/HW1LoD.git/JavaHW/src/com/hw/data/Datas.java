package com.hw.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.hw.book.Book;

public class Datas {
	
	public static List<Book> books = new ArrayList<Book>();
	
	//책 이름 책가격 출판사 입고시간
	public static void initializeData() {
		
		//Mercury(~ BC1000)
		books.add(new Book("최초의 횃불",12000,"Mercury",LocalDateTime.of(-10000, 2, 3, 21, 20)));
		
		//Venus(BC 1000 ~ BC 0)
		books.add(new Book("펠로폰네소스 전쟁",15000,"Venus",LocalDateTime.of(-431, 7, 24, 6, 05)));
		books.add(new Book("포에니 전쟁",18000,"Venus",LocalDateTime.of(-246, 12, 3, 3, 00)));
		
		//Earth(AD 1 ~ AD 500)
		books.add(new Book("마지막 빛, 콘스탄티누스의 철학",11000,"Earth",LocalDateTime.of(306, 12, 3, 7, 00)));
		books.add(new Book("로마 제국의 몰락",9000,"Earth",LocalDateTime.of(476, 6, 21, 10, 30)));
		
		//Mars(AD 501 ~ AD 1000)
		books.add(new Book("암흑의 시대",12000,"Mars",LocalDateTime.of(500, 1, 1, 5, 0)));
		books.add(new Book("신라의 삼국통일",21000,"Mars",LocalDateTime.of(676, 3, 13, 17, 20)));
		books.add(new Book("해상왕 장보고",12000,"Mars",LocalDateTime.of(780, 2, 3, 11, 20)));
		books.add(new Book("고려의 후삼국통일",12000,"Mars",LocalDateTime.of(937, 11, 20, 18, 40)));
		
		//Jupiter(AD 1001 ~ AD 1500)
		books.add(new Book("귀주대첩",21000,"Jupiter",LocalDateTime.of(1018, 3, 10, 11, 10)));
		books.add(new Book("세종대왕의 훈민정음",50000,"Jupiter",LocalDateTime.of(1446, 2, 3, 21, 20)));
		books.add(new Book("콜럼버스의 신항로 개척",27000,"Jupiter",LocalDateTime.of(1492, 8, 3, 8, 00)));
		
		//Saturn(AD 1501 ~ AD 1700)
		books.add(new Book("임진왜란과 도요토미 히데요시의 야망",12000,"Saturn",LocalDateTime.of(1592, 2, 3, 21, 20)));
		books.add(new Book("세키가하라 전투",19000,"Saturn",LocalDateTime.of(1663, 12, 10, 12, 00)));
		books.add(new Book("병자호란과 조선의 정세",12000,"Saturn",LocalDateTime.of(1663, 12, 10, 12, 00)));
		
		//Uranus(AD 1701 ~ AD 1900)
//		books.add(new Book("Poeni War","포에니 전쟁",12000,"Venus",LocalDateTime.of(2018, 2, 3, 21, 20)));
//		books.add(new Book("Poeni War","포에니 전쟁",12000,"Venus",LocalDateTime.of(2018, 2, 3, 21, 20)));
//		books.add(new Book("Poeni War","포에니 전쟁",12000,"Venus",LocalDateTime.of(2018, 2, 3, 21, 20)));
		books.add(new Book("병인양요",12000,"Uranus",LocalDateTime.of(1866, 10, 15, 15, 30)));
		
		//Neptune(AD 1900 ~ Now)
		books.add(new Book("사라예보의 총성(1차 세계대전)",12000,"Neptune",LocalDateTime.of(2018, 2, 3, 21, 20)));
		books.add(new Book("대공황의 시대",12000,"Neptune",LocalDateTime.of(2018, 2, 3, 21, 20)));
		books.add(new Book("히틀러의 야망(2차 세계대전)",12000,"Neptune",LocalDateTime.of(2018, 2, 3, 21, 20)));
		books.add(new Book("한국전쟁",62500,"Neptune",LocalDateTime.of(1950, 6, 25, 4, 00)));		
		
	}
	
	
}
