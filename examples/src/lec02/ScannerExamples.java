package lec02;

import java.util.Scanner; //You must import the Scanner class before you can use it.

public class ScannerExamples {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String stringValue = input.nextLine();
		
		//Prompt the user to enter an integer value
		System.out.println("Enter an integer value: ");
		int intValue = input.nextInt();
		
		//Prompt the user to enter a double value
		System.out.println("Enter a double value: ");
		double doubleValue = input.nextDouble();
	
		//Print all of the variables;
		System.out.println("intValue = " + intValue);
		System.out.println("doubleValue = " + doubleValue);
		System.out.println("stringValue = " + stringValue);
	}
}