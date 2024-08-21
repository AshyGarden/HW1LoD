package com.hw.service;

import com.hw.data.Datas;
import com.hw.global.*;

public class BookListService implements Start{
	
	@Override
	public void start() {
		while(true){
			AppUI.bookListScreenKr();
			int selection = AppFuncs.inputInteger();
			
			switch(selection) {
				case GlobalVariables.returnNum:     //상위 메뉴로 돌아가기
					return; 		
				case GlobalVariables.listSearchNum: //전체 책 리스트 순회
					showBookList();
					break;
				default:
					AppUI.defaultMessages();		
			}
			AppUI.pressEnter();
			AppFuncs.inputString();
		}				
	}

	private void showBookList() {
		System.out.println("모든 이야기들의 리스트들 입니다.");
		for(int i=0; i<Datas.books.size(); i++) {
			System.out.println(Datas.books.get(i).toString());
		}	
	}
}
