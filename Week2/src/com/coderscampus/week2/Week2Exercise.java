package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in any input:");
//		String userInput = scanner.nextLine();

		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
		if (convertedInput <50 || convertedInput >300) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
			
		System.out.println("You typed in: " + convertedInput);
	}

}
