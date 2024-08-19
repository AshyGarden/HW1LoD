package com.hw.main;

import com.hw.global.AppFuncs;
import com.hw.global.AppUI;
import com.hw.global.GlobalVariables;

public class AppController {
	public void chooseSystem(int inputNum, boolean flag) {		
		switch(inputNum) {  	
	    	case GlobalVariables.saveNum: 
	    		if(flag) {
	    			System.out.println("You choose Write the new story.\nCan't wait to see how much interest it'll be");	    				    			
	    		} else {
	    			System.out.println("새로운 이야기를 작성하러 와주셨군요. 얼마나 재밌을지 기대됩니다!");	    			
	    		}
	    		//tInfo.start();
	    		break;
	    			
	    	case GlobalVariables.listNum:     
	    		if(flag) {
	    			System.out.println("You choose Write the new story.\nCan't wait to see how much interest it'll be");	    				    			
	    		} else {
	    			System.out.println("새로운 이야기를 작성하러 와주셨군요. 얼마나 재밌을지 기대됩니다!");	    			
	    		}
//	    		tSituation.start();
	    		break;
	    			
	    	case GlobalVariables.researchNum:     
	    		if(flag) {
	    			System.out.println("You choose Write the new story.\nCan't wait to see how much interest it'll be");	    				    			
	    		} else {
	    			System.out.println("새로운 이야기를 작성하러 와주셨군요. 얼마나 재밌을지 기대됩니다!");	    			
	    		}
	    		break;
	    		
	    	//언어변경
	    	case GlobalVariables.switchLanguage:
	    		AppFuncs.switchLanguage(flag);
//	    		tSwitchLan.start();
	    		return;
//	    		
//	    	//고객제안 	
//	    	case GlobalVariables.suggestNum:
//	    		System.out.println("고객 제안 모드로 돌입합니다.");
//	    		tSuggest.start();
//	    		break;
//	    	
//	    	//프로그램 종료
//	    	case GlobalVariables.terminateNum:
//	    		AppUI.Shutdown();
//	    		break;
	    		
	    	default:
	    		AppUI.defaultMessages(flag);
	    		break;
		}
	}

}
