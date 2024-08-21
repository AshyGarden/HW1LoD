package com.hw.service;

import java.time.LocalDateTime;

import com.hw.book.Book;
import com.hw.data.Datas;
import com.hw.global.*;

public class BookSaveService implements Start{

	@Override
	public void start() {
		while(true) {
			AppUI.bookSaveScreenKr();			
		
			int selection = AppFuncs.inputInteger();
		
			switch(selection) {
				case GlobalVariables.returnNum:     //상위 메뉴로 돌아가기
					return; 		
				case GlobalVariables.saveIntialize:
					bookSave();
					break;
				default:
					AppUI.defaultMessages();		
			}
			AppUI.pressEnter();
			AppFuncs.inputString();			
		}
	}

	private void bookSave() {
//		if(flag == true) {
//			System.out.println("Save Initialize Activate!");
//			System.out.println("Input the Title of your Story!");
//			System.out.print(">>>");
//			String titleEn = AppFuncs.inputString();
//			
//			System.out.println("Input the Korean Title of your Story!");
//			System.out.print(">>>");
//			String titleKor = AppFuncs.inputString();
//			
//			System.out.println("How much do you think this story is worth?\nPlease input Integer!(Else return previous page!)");
//			System.out.print(">>>");
//			int price = AppFuncs.inputInteger(flag);
//					
//			String publisher ="";
//			System.out.println("Lastly, Let's Input the Date");
//			System.out.println("What year did this happen?(BC must be input minus value!)");
//			System.out.print(">>>");
//			int year = AppFuncs.inputInteger(flag);	
//			if(year <= -1000) {
//				publisher = "Mercury";
//			} else if(year <= 0) {
//				publisher = "Venus";
//			} else if(year <= 500) {
//				publisher = "Earth";
//			} else if(year <= 1000) {
//				publisher = "Mars";
//			} else if(year <= 1500) {
//				publisher = "Jupiter";
//			} else if(year <= 1700) {
//				publisher = "Saturn";
//			} else if(year <= 1900) {
//				publisher = "Uranus";
//			} else {
//				publisher = "Neptune";
//			}
//			
//			System.out.println("What month did this happen?");
//			System.out.print(">>>");
//			int month = AppFuncs.inputInteger(flag);
//			
//			System.out.println("What day did this happen?");
//			System.out.print(">>>");
//			int day = AppFuncs.inputInteger(flag);
//			
//			System.out.println("What hour did this happen?(input 24hour logic)");
//			System.out.print(">>>");
//			int hour = AppFuncs.inputInteger(flag);
//			
//			System.out.println("What minute did this happen?");
//			System.out.print(">>>");
//			int minute = AppFuncs.inputInteger(flag);
//	
//			Datas.books.add(new Book(titleEn,titleKor,price,publisher,
//					LocalDateTime.of(year,month,day,hour,minute)));
//			System.out.println("The saved events are as follows");
//			System.out.println(Datas.books.get(Datas.books.size()-1).toString());
//			
//		} else {
			
		System.out.println("저장을 시작합니다!");
		System.out.println("이야기의 제목을 적어주세요.");
		System.out.print(">>>");
		String title = AppFuncs.inputString();
		
		System.out.println("이 이야기는 얼만큼의 가치를 지녔다고 생각하시나요?\n정수로 입력해주세요!(아닐시 이전 페이지로 돌아갑니다!");
		System.out.print(">>>");
		int price = AppFuncs.inputInteger();
				
		String publisher ="";
		System.out.println("마지막으로 날짜를 넣어볼까요?");
		System.out.println("몇년도에 이 사건이 일어났나요?(기원전은 음수값으로 입력해주세요!)");
		System.out.print(">>>");
		int year = AppFuncs.inputInteger();	
		if(year <= -1000) {
			publisher = "Mercury";
		} else if(year <= 0) {
			publisher = "Venus";
		} else if(year <= 500) {
			publisher = "Earth";
		} else if(year <= 1000) {
			publisher = "Mars";
		} else if(year <= 1500) {
			publisher = "Jupiter";
		} else if(year <= 1700) {
			publisher = "Saturn";
		} else if(year <= 1900) {
			publisher = "Uranus";
		} else {
			publisher = "Neptune";
		}
		
		System.out.println("어느 달에 이 사건이 일어났나요?");
		System.out.print(">>>");
		int month = AppFuncs.inputInteger();
		
		System.out.println("몇 일에 이 사건이 일어났나요?");
		System.out.print(">>>");
		int day = AppFuncs.inputInteger();
		
		System.out.println("몇 시에 이 사건이 일어났나요?(24시간 방법으로 입력해주세요)");
		System.out.print(">>>");
		int hour = AppFuncs.inputInteger();
		
		System.out.println("몇 분에 이 사건이 일어났나요?");
		System.out.print(">>>");
		int minute = AppFuncs.inputInteger();
	
		Book newBook = new Book(title,price,publisher,
				LocalDateTime.of(year,month,day,hour,minute));
		
		Datas.books.add(newBook);
		System.out.println("저장된 사건은 다음과 같습니다.");
		System.out.println(newBook.toString());
	
	}		
}


