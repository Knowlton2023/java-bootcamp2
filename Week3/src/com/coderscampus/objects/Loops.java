package com.coderscampus.objects;

public class Loops {

	public static void main (String[] args) {

		// for Loop example code
		ForLoopExample forExample = new ForLoopExample();
//		forExample.forLoopExample1();
//		forExample.incrementExample1();
		int j = 0;
		forExample.incrementExample2(j++);
		System.out.println("Outside method j = " + j);
		forExample.incrementExample2(++j);
		System.out.println("Outside method j = " + j);
		
		// while loop example code
//		WhileLoopExample whileExample = new WhileLoopExample();
//		whileExample.whileLoopExample1(); 
//		whileExample.whileLoopExample2(); 
//		whileExample.whileLoopExample3();	
		
		
	}
}
