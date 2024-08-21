package com.hw.main;

import com.hw.global.*;
import com.hw.service.*;

public class AppController {
	
	BookSaveService bookSaveService = new BookSaveService();       //저장
	BookListService bookListService = new BookListService();       //목록
	BookSearchService bookSearchService = new BookSearchService(); //검색
	
	public void chooseSystem(int inputNum) {	
		switch(inputNum) {  	
			//저장
			case GlobalVariables.saveNum: 
				System.out.println("새로운 이야기를 작성하러 와주셨군요. 얼마나 재밌을지 기대됩니다!");	    			
				bookSaveService.start();
				break;
			
			//목차
			case GlobalVariables.listNum:     
				System.out.println("목차 검색을 실행합니다!");	    						
				bookListService.start();
				break;
				
			//검색
			case GlobalVariables.researchNum:     			
				System.out.println("검색 기능을 실행합니다!");	    			
				bookSearchService.start();
				break;
		
			//프로그램 종료
			case GlobalVariables.terminateNum:
				AppFuncs.shutdown();
				break;
				
			default:
				AppUI.defaultMessages();
				break;
		}
	}
}
