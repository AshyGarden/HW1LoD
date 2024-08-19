package com.hw.global;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppFuncs {
	
	private static Scanner sc = new Scanner(System.in);
	
	//Usual Functions
	public static void shutdown(boolean flag) {
		if(flag) {
			System.out.println("Please come back with interesting story:)");						
		} else {
			System.out.println("재밌는 이야기를 가지고 다시 와주세요:)");			
		}
		sc.close();
		System.exit(0);
	}
	
	public static String inputString() { //문자를 입력받는 곳에서 사용
		return sc.nextLine();
	}

	public static int inputInteger(boolean flag) { //숫자를 입력받는 곳에서 사용
		int inputNum = 0;
		try {
			inputNum = sc.nextInt();
		} catch (InputMismatchException e) {
			if(flag) {
				System.out.println("Please enter an integer.");								
			} else {
				System.out.println("정수로 입력해 주세요.");				
			}
		} finally {
			sc.nextLine();
		}

		return inputNum;
	}

	
	public static Boolean switchLanguage(boolean flag) {
		boolean newFlag = !flag;
		
		if(newFlag == true) {
			System.out.println("Return to English");						
		} else {
			System.out.println("한국어로 변경되었습니다.");			
		}
		
		return newFlag;
	}
	
}
