package com.qa.File;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputUsingClasses {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a:");
		int a =in.nextInt();
		System.out.print("b:");
		int b =in.nextInt();
		int result = a+b;
		System.out.print("Sum:"+result);

	}

}

