package com.qa.File;

import java.io.Console;

public class ConsoleInput {

	
	public void readFromConsole(String a,String b){
		Console c1 = System.console();
		System.out.println("a:");
		String a1 = c1.readLine( a ,10);
		int a2 = Integer.parseInt(a1);
		System.out.println("b:");
		String b1 = c1.readLine( a ,10);
		int b2 = Integer.parseInt(b1);
		int Divide = a2/b2;
		System.out.print("Divide:"+Divide);	
			
	}
	

public static void main(String[] args) {
	ConsoleInput c = new ConsoleInput();
	c.readFromConsole("20","2");

}
}