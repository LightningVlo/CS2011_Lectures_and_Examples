package lec02;

public class GoodUseOfConstants {

	public static void main(String[] args) {
		//Various mathematical constants.
		final double GOLDEN_RATIO = ( 1 + Math.sqrt(5) ) / 2.0;
		final double PI = 3.14159265;
		
		//A good practice is to define your menu choices as a constant, to
		//make your code more readable.
		final int MENU_CHOICE1 = 1;
		final int MENU_CHOICE2 = 2;
		final int MENU_CHOICE3 = 3;
		
		int choice = 1; //This value would normally come from user input.
		
		switch(choice) {
		case MENU_CHOICE1: 	//code for choice 1
			               	break;
		case MENU_CHOICE2: 	//code for choice 1
            				break;
		case MENU_CHOICE3: 	//code for choice 1
            				break;
		}
	}
}