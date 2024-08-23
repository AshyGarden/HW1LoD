package com.hw.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.hw.book.Book;
import com.hw.data.Datas;
import com.hw.global.*;

public class BookSearchService implements Start{

	private boolean flag = false;
	@Override
	public void start() {
		while(true){
			AppUI.bookSearchScreenKr();
			int selection = AppFuncs.inputInteger();
			
			switch(selection) {
				case GlobalVariables.returnNum:     	//상위 메뉴로 돌아가기
					return;
				case GlobalVariables.bookSearchNum:     //책으로 검색
					bookSearch();
					break;
				case GlobalVariables.publishSearchNum:  //출판사로 검색
					publisherSearch();
					break;
				default:
					AppUI.defaultMessages();		
			}
			AppUI.pressEnter();
			AppFuncs.inputString();
		}					
	}
	
	private void publisherSearch() {
		AppUI.publichSearchScreenKr();
		String inputPb =  AppFuncs.inputString().toLowerCase();
		
		System.out.println("조회하신 출판사의 결과는 다음과 같습니다.");
		for(int i=0; i<Datas.books.size(); i++) {
			if(Datas.books.get(i).getPubliser().toLowerCase().equals(inputPb)) {
				System.out.println(Datas.books.get(i).toString());
			}
		}
	}

	private void bookSearch() {
		while(true){	
			AppUI.bookSearchByNameScreenKr();
			int selection = AppFuncs.inputInteger();			
			switch(selection) {
				case GlobalVariables.bookNameSearch: //이름순 조회하기
					searchByBookName();
					break;
				case GlobalVariables.bookTerm: //기간순으로 조회하기
					searchByTerm();
					break;
				case GlobalVariables.bookComparePrice: //가격순으로 조회하기
					searchByPrice();
					break;
				case GlobalVariables.bookEdit: //책 정보수정
					editBookInfo();
					break;
				case GlobalVariables.bookDelete: //책 삭제하기
					deleteBookInfo();
					break;	
				case GlobalVariables.returnNum: 
					return; //이전 페이지으로 돌아가기				
				default:
					AppUI.defaultMessages();	
			}
			AppUI.pressEnter();
			AppFuncs.inputString();
		}	
	}
	
	private void searchByBookName() {
		//오름차순 내림차순
		System.out.println("정렬 방식을 설정해주세요.[1.오름차순/ 2.내림차순]");
		int inputNum =  AppFuncs.inputInteger();
		List<Book> sortedList = Datas.books;
		switch(inputNum) {
			case 1:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getName))
					.collect(Collectors.toList());
				System.out.println("조회하신 오름차순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			case 2:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getName).reversed())
					.collect(Collectors.toList());
				System.out.println("조회하신 내림차순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			default:
				System.out.println("번호를 잘못 입력하여 돌아갑니다.");
				return;
		}
	}

	private void searchByTerm() {
		//오름차순 내림차순
		System.out.println("정렬 방식을 설정해주세요.[1.최신순/ 2.오래된순]");
		int inputNum =  AppFuncs.inputInteger();
		List<Book> sortedList = Datas.books;
		switch(inputNum) {
			case 1:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getAddedTime).reversed())
					.collect(Collectors.toList());
				System.out.println("조회하신 최신순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			case 2:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getAddedTime))
					.collect(Collectors.toList());
				System.out.println("조회하신 오래된순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			default:
				System.out.println("번호를 잘못 입력하여 돌아갑니다.");
				return;
		}
	}
	
	private void searchByPrice() {
		System.out.println("정렬 방식을 설정해주세요.[1.가격이 싼 순/ 2.가격이 비싼 순]");
		int inputNum =  AppFuncs.inputInteger();
		List<Book> sortedList = Datas.books;
		switch(inputNum) {
			case 1:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getPrice))
					.collect(Collectors.toList());
				System.out.println("조회하신 가격이 싼 순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			case 2:
				sortedList = sortedList.stream()
					.sorted(Comparator.comparing(Book::getPrice).reversed())
					.collect(Collectors.toList());
				System.out.println("조회하신 가격이 비싼 순의 결과는 다음과 같습니다.");
				sortedList.forEach(System.out::println);
				break;
			default:
				System.out.println("번호를 잘못 입력하여 돌아갑니다.");
				return;
		}
	}
	
	private void editBookInfo() {
		System.out.println("수정하실 책의 이름을 적어주세요.");
		System.out.print(">>>");
		String inputName = AppFuncs.inputString();	
		Book selectedBook = null;
		for(int i=0; i<Datas.books.size(); i++) {
			if(Datas.books.get(i).getName().equals(inputName)) {	
				selectedBook = Datas.books.get(i);
				flag = true;
			}
		}
			
		if(selectedBook == null) {
			System.out.println("적어주신 이름의 책은 존재하지 않습니다.");
			return;	
		} else {	
			System.out.println("어떤 정보를 수정 하실건가요?");
			System.out.println("[1.책 제목/ 2.책 가격/ 3. 책 출판사/ 4. 출판 기간/ 5.모든정보수정]");
			System.out.print(">>>");
			while(true){	
				int selection = AppFuncs.inputInteger();			
				switch(selection) {
					case GlobalVariables.bookEditName: //책 제목 수정하기
						editBookName(selectedBook); 
						return;
					case GlobalVariables.bookEditPrice: //책 가격 수정하기
						editPrice(selectedBook);
						return;
					case GlobalVariables.bookEditPubliser: //책 출판사 수정하기
						editPubliser(selectedBook);
						return;
					case GlobalVariables.bookEditDate: //책 출판기간
						editDate(selectedBook);
						return;
					case GlobalVariables.bookEditAll: //전체정보 수정하기
						editAllBook(selectedBook);
						return;
					case GlobalVariables.returnNum:
						System.out.println("이전 페이지로 돌아갑니다.");
						return;
					default:
						System.out.println("번호를 잘못 입력하여 돌아갑니다.");
						return; //이전 페이지으로 돌아가기				
				}
			}		
		}
	}	

	private void editBookName(Book selectedBook) { //5141
		System.out.println("수정할 제목을 적어주세요.");
		System.out.print(">>>");
		String inputName = AppFuncs.inputString();
		
		Book editedBook = new Book(inputName, selectedBook.getPrice(),
				selectedBook.getPubliser(), selectedBook.getAddedTime());
		Datas.books.add(editedBook);
		Datas.books.remove(selectedBook);
		
		System.out.println("수정하신 책의 정보입니다.");
		System.out.println(editedBook.toString());
	}
	
	private void editPrice(Book selectedBook) { //5142
		System.out.println("수정할 가격을 적어주세요.");
		System.out.print(">>>");
		int inputPrice = AppFuncs.inputInteger();
		
		Book editedBook = new Book(selectedBook.getName(), inputPrice,
				selectedBook.getPubliser(), selectedBook.getAddedTime());
		Datas.books.add(editedBook);
		Datas.books.remove(selectedBook);
		
		System.out.println("수정하신 책의 정보입니다.");
		System.out.println(editedBook.toString());
	}
	
	private void editPubliser(Book selectedBook) { //5143
		System.out.println("수정할 출판사를 적어주세요.");
		System.out.print(">>>");
		String inputName = AppFuncs.inputString();
		
		Book editedBook = new Book(inputName, selectedBook.getPrice(),
				selectedBook.getPubliser(), selectedBook.getAddedTime());
		Datas.books.add(editedBook);
		Datas.books.remove(selectedBook);
		
		System.out.println("수정하신 책의 정보입니다.");
		System.out.println(editedBook.toString());
	}
	
	private void editDate(Book selectedBook) { //5144
		System.out.println("수정할 출판 날짜및 시간을 입력해주세요.");
		System.out.print(">>>");
		String inputDate = AppFuncs.inputString();
		
//		
//		LocalDateTime parsedTime;
//		
//		Book editedBook = new Book(selectedBook.getName(), selectedBook.getPrice(),
//				selectedBook.getPubliser(), );
//		Datas.books.add(editedBook);
//		Datas.books.remove(selectedBook);
//		
//		System.out.println("수정하신 책의 정보입니다.");
//		System.out.println(editedBook.toString());
	}
	
	private void editAllBook(Book selectedBook) { //5145
		System.out.println("수정할 제목을 적어주세요.");
		System.out.print(">>>");
		String inputName = AppFuncs.inputString();
		
		System.out.println("수정할 가격을 적어주세요.");
		System.out.print(">>>");
		int inputPrice = AppFuncs.inputInteger();
		
		System.out.println("수정할 출판사를 적어주세요.");
		System.out.print(">>>");
		String inputPubliser = AppFuncs.inputString();
				
		System.out.println("수정할 출판 날짜를 적어주세요.");
		System.out.println("수정할 출판 날짜를 적어주세요.");
		System.out.print(">>>");
		int inputYear = AppFuncs.inputInteger();
		
		
	}

	private void deleteBookInfo() {
		System.out.println("삭제하실 책의 이름을 적어주세요.");
		System.out.print(">>>");
		String inputName = AppFuncs.inputString();
		Book selectedBook = null;
		for(int i=0; i<Datas.books.size(); i++) {
			if(Datas.books.get(i).getName().equals(inputName)) {
				selectedBook = Datas.books.get(i);
				flag = true;
			}
		}
		
		if(selectedBook == null) {
			System.out.println("적어주신 이름의 책은 존재하지 않습니다.");
			return;	
		} else {
			Datas.books.remove(selectedBook);			
			System.out.println("해당 책을 삭제하였습니다.");			
		}
	}

	
	
}
