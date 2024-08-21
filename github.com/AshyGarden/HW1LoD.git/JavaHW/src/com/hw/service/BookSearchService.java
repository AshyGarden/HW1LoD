package com.hw.service;

import com.hw.data.Datas;
import com.hw.global.*;

public class BookSearchService implements Start{

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
				case GlobalVariables.bookNewest: //최신순으로 조회하기
					searchByNewest();
					break;
				case GlobalVariables.bookHighPrice: //비싼 가격순으로 조회하기
					searchByExpansive();
					break;
				case GlobalVariables.bookLowPrice: //싼 가격순으로 조회하기
					searchByCheapest();
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
		
	}

	

	private void searchByExpansive() {
			
	}
	
	private void searchByCheapest() {
		
	}

	private void searchByNewest() {
		
	}
	
	private void deleteBookInfo() {
		
	}

	private void editBookInfo() {
		
	}
	
}
