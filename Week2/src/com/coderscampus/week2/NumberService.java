package com.coderscampus.week2;
import java.util.Scanner;

public class NumberService  {

	Integer getNumber () {
		Scanner numberInput = new Scanner(System.in);
		System.out.println("Type your number between 50 and 300: ");
		String number = numberInput.nextLine();
		Integer convertedNumber = Integer.parseInt(number);
		return convertedNumber;
	}
}
