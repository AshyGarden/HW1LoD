package com.hw.global;

public class AppUI {
	
	public static void defaultMessages() {
		System.out.println("# 메뉴를 다시 입력해주세요.");			
	}
	
	public static void pressEnter() {
		System.out.println("\n======계속 진행하시려면 ENTER를 누르세요======");			
	}	
	
	// 0. 시작화면(Main)
//	public static void startScreen() {
//		System.out.println("\n (☞ﾟヮﾟ)☞ Library Of Dimension ☜(ﾟヮﾟ☜)");
//		System.out.println("💾 1000 - New Story Add(Save) ");
//		System.out.println("🏟 3000 - Show List of Histories ");
//		System.out.println("🔍 5000 - Research Histories");
//		System.out.println("🅰 9000 - Switch the Language");		
//		System.out.println("🖥 9999 - Exit the LoD");		 
//		System.out.println("--------------------------------------");
//		System.out.print(">>>");
//	}
	
	public static void startScreenKr() {
		System.out.println("\n (☞ﾟヮﾟ)☞ 차원의 도서관 ☜(ﾟヮﾟ☜)");
		System.out.println("💾 1000 - 새로운 이야기를 작성(저장) ");
		System.out.println("🏟 3000 - 역사 목록보기 ");
		System.out.println("🔍 5000 - 역사 검색하기");			
//		System.out.println("㈎  9000 - 언어 변경하기");			
		System.out.println("🖥 9999 - 프로그램 종료");		 
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	// 1. 책 등록하기
//	public static void bookSaveScreen() {
//		System.out.println("\n ======== 💾 New Story Add(Save)==========");
//		System.out.println(" 📔 1100 - Write the new story (Save)");
//		System.out.println(" 🏃‍♀️ 9    - Return to previous page");
//		System.out.println("--------------------------------------");
//		System.out.print(">>>"); 
//	}
	
	public static void bookSaveScreenKr() {
		System.out.println("\n ======== 💾 책 등록하기(저장)==========");
		System.out.println(" 📔 1100 - 책 등록");
		System.out.println(" 🏃‍♀️ 9    - 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	// 2. 책 목록보기
//	public static void bookListScreen() {
//		System.out.println("\n ======== 🏟 Show List of Histories==========");
//		System.out.println(" 🏟 3100 - Show all of histories");
//		System.out.println(" 🏃‍♀️ 9    - Return to previous page");
//		System.out.println("--------------------------------------");
//		System.out.print(">>>"); 
//	}
	
	public static void bookListScreenKr() {
		System.out.println("\n ======== 🏟 역사 목록보기==========");
		System.out.println(" 🏟 3100 - 역사 목록보기");
		System.out.println(" 🏃‍♀️ 9    - 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	public static void bookSearchScreenKr() {
		System.out.println("\n ======== 🏟 역사 검색하기==========");
		System.out.println(" 🏟 5100 - 책 이름으로 검색하기");
		System.out.println(" 🏟 5200 - 출판사로 검색하기");
		System.out.println(" 🏃‍♀️ 9    - 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	public static void publichSearchScreenKr() {
		System.out.println("검색 하실 출판사 명을 입력해주세요.\n현재 존재하는 출판사는 다음과 같습니다.");
		System.out.println("[~ BC1000: Mercury/ BC999 ~ AD0: Venus/ AD1~500: Earth/ AD501 ~ 1000: Mars]");
		System.out.println("[AD1001~1500: Jupiter/ AD1501~1700: Saturn / AD1701~1900: Uranus/ AD 1901~Now: Neptune]");
		System.out.println("(대소문자 구분없이 적어주셔도됩니다.)");
		System.out.print(">>>");
	}
	
	public static void bookSearchByNameScreenKr() {
		System.out.println("\n ======== 🏟 책 이름으로 검색하기==========");
		System.out.println(" 🏟 5110 - 이름순 조회");
		System.out.println(" 🏟 5120 - 최신순 조회");
		System.out.println(" 🏟 5130 - 비싼 가격순 조회");
		System.out.println(" 🏟 5140 - 싼 가격순 조회");
		System.out.println(" 🏟 5150 - 책 정보수정");
		System.out.println(" 🏟 5160 - 책 삭제하기");
		System.out.println(" 🏃‍♀️ 9    - 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
}
