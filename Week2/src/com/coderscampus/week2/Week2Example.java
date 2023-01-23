package com.coderscampus.week2;

//import java.util.Scanner;

public class Week2Example {
	public static void main (String[] args) {
		// This is just for teaching purposes ///////
		//  with respect to imports / packages     //
		// java.lang is by default imported for us //
		java.lang.String aString = "Hello World";  //
		String anotherString = "Another String";   //
		/////////////////////////////////////////////
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Type in any input:");
		//String userInput = scanner.nextLine();
		//System.out.println("You typed in: " + userInput);

		//String input = scanner.nextLine();
		//Integer convertedInput = Integer.parseInt(input);
		
		NumberService myNumber = new NumberService();
		if (myNumber.getNumber() > 49 && myNumber.getNumber() < 301) {
			System.out.println("The number you type in was: " + myNumber.getNumber());
		} else {
			System.out.println("The number you typed in was: null");
		}

//		if (convertedInput > 300) {
//			System.out.println("The number you typed in was: null");			
//		} else if (convertedInput < 50) {
//			System.out.println("The number you typed in was: null");			
//		} else {
//			System.out.println("The number you typed in was: " + convertedInput);			
//		}
//		scanner.close();

	}

}
