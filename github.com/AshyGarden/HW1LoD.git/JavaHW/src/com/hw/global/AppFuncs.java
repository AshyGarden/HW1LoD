package com.hw.global;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppFuncs {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String inputString() { //문자를 입력받는 곳에서 사용
		return sc.nextLine();
	}

	public static int inputInteger() { //숫자를 입력받는 곳에서 사용
		int inputNum = 0;
		try {
			inputNum = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수로 입력해 주세요.");				
		} finally {
			sc.nextLine();
		}

		return inputNum;
	}

	//Usual Functions
	public static void shutdown() {
		System.out.println("재밌는 이야기를 가지고 다시 와주세요:)");				
		sc.close();
		System.exit(0);
	}
	
}
