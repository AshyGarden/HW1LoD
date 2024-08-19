package com.hw.global;

public class AppUI {
	
	public static void defaultMessages(boolean flag) {
		if(flag) {
			System.out.println("# Please input the menu again.");		
		} else {
			System.out.println("# 메뉴를 다시 입력해주세요.");			
		}
	}
	
	public static void pressEnter(boolean flag) {
		if(flag) {
			System.out.println("\n======Press ENTER to continue======");	
		} else {
			System.out.println("\n======계속 진행하시려면 ENTER를 누르세요======");			
		}
	}	
	
	// 0. 시작화면(Main)
	public static void startScreen() {
		System.out.println("\n (☞ﾟヮﾟ)☞ Library Of Dimension ☜(ﾟヮﾟ☜)");
		System.out.println("💾 1000 - New Story Add(Save) ");
		System.out.println("🏟 3000 - Show List of Histories ");
		System.out.println("🔍 5000 - Research Histories");
		System.out.println("🅰 7000 - Switch the Language");		
		System.out.println("🖥 9999 - Exit the LoD");		 
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	public static void startScreenKr() {
		System.out.println("\n (☞ﾟヮﾟ)☞ 차원의 도서관 ☜(ﾟヮﾟ☜)");
		System.out.println("💾 1000 - 새로운 이야기를 작성(저장) ");
		System.out.println("🏟 3000 - 역사 목록보기 ");
		System.out.println("🔍 5000 - 역사 검색하기");			
		System.out.println("㈎  7000 - 언어 변경하기");			
		System.out.println("🖥 9999 - 프로그램 종료");		 
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	// 1. 책 등록하기
	public static void bookSaveScreen() {
		System.out.println("\n ======== 💾 New Story Add(Save)==========");
		System.out.println(" 📔 - Write the new story (Save)");
		System.out.println(" 🏃‍♀️ - Return to previous page");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	public static void bookSaveScreenKr() {
		System.out.println("\n ======== 💾 책 등록하기(저장)==========");
		System.out.println(" 📔 - 책 등록");
		System.out.println(" 🏃‍♀️ 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	// 2. 책 목록보기
	public static void bookListScreen() {
		System.out.println("\n ======== 🏟 Show List of Histories==========");
		System.out.println(" 🏟 - Show all of histories");
		System.out.println(" 🏃‍♀️ - Return to previous page");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}
	
	public static void bookListScreenKr() {
		System.out.println("\n ======== 🏟 역사 목록보기==========");
		System.out.println(" 🏟 - 역사 목록보기");
		System.out.println(" 🏃‍♀️ - 이전 페이지로 돌아가기");
		System.out.println("--------------------------------------");
		System.out.print(">>>"); 
	}

}
