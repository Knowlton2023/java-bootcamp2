package com.coderscampus.objects;

import java.util.Date;
import java.util.Scanner;

public class WhileLoopExample {
	void whileLoopExample1 () {
		System.out.println("Inside whileLoopExample1 method");
		// while (/*boolean expression here*/);  
		// This is exactly how a FOR loop works
		// you don't actually ever NEED a FOR loop
		// as you can create one with a WHILE loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		
		System.out.println("Done");
	
	}
	
	void whileLoopExample2 () {
		
		Date now = new Date();
		Date stopNow = new Date(123, 8, 19, 20, 0, 0);  // BE CAREFUL HERE
//		System.out.println(now);
//		System.out.println(stopNow);
		
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(i + ": " + now);
			now = new Date();
		}
	}

	void whileLoopExample3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		int myNumber = scanner.nextInt();

		int i = 0;
		while (myNumber < 50 || myNumber > 300) {
			i = i + 1;
			System.out.println("Oops, that number was't between 50 and 300, try again:");
			System.out.println("Type a number between 50 and 300");
			myNumber = scanner.nextInt();
		}
		
		System.out.println("The number you typed in was:" + myNumber);
	}

}
