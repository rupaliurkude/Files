package com.qa.File;

import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) {
		DataInputStream ds = new DataInputStream(System.in);
		
		try {
			System.out.print("a:");
			String a =ds.readLine();
			int a1 =Integer.parseInt(a);
			System.out.print("b:");
			String b = ds.readLine();
			int b1 = Integer.parseInt(b);
			int multi = a1*b1;
			System.out.print("Multiplication:"+multi);	
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	
	}

}
