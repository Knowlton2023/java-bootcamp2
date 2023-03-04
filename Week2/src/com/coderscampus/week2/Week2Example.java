
package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		// This is just for teaching purposes ///////
		//  with respect to imports / packages     //
		// java.lang is by default imported for us //
		java.lang.String aString = "Hello World";  //
		String anotherString = "Another String";   //
		/////////////////////////////////////////////
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if (name.equals("Trevor") 
				|| age.equals("36")
				|| name.equals("TJ")) {
			System.out.println("Holy cow it's me!");
		} else {
			System.out.println("Hello: " + name);
		}
		
		scanner.close();
		
		
//		int age = 21;
//		
//		if (age >= 19) {       
//			System.out.println("You are an adult");
//			if (age > 65) {
//				System.out.println("You are a senior");
//			}
//		} else if (age >= 13) {
//			System.out.println("You are a teenager");
//		} else if (age == 12) {
//			System.out.println("You are a pre-teen");
//		} else {
//			System.out.println("You are a child");
//		}
//		
//		String output = "Your age is " + age;
//		
//		System.out.println(output);
//		
//		if (output.equals("Your age is 18")) {
//			System.out.println("Yay you can vote!");
//		} else if (output.equals("Your age is 21")) {
//			System.out.println("Yay you can drink / gamble!");
//		}

	
	
	}
}
