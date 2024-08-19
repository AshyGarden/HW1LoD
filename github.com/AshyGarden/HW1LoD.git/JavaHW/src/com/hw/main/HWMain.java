package com.hw.main;

import com.hw.data.Datas;
import com.hw.global.AppFuncs;
import com.hw.global.AppUI;
import com.hw.global.GlobalVariables;

public class HWMain {

	public static void main(String[] args) {
		Datas.initializeData();
		AppController controller = new AppController();
		boolean flag = GlobalVariables.languageFlag; 	//English First
		
		while(true) {
			AppUI.startScreen(); 
			int selectNumber = AppFuncs.inputInteger(flag);
			controller.chooseSystem(selectNumber, flag);
		}
	}

}
