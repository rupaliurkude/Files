package com.qa.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInput {
	
public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 System.out.print("Input for a:");
			 String a = br.readLine();
			int a1 =Integer.parseInt(a);
			System.out.print("Input for b:");
			String b = br.readLine();
			int b1 =Integer.parseInt(b);
			int sub = a1-b1;
			System.out.print("Sub:"+sub);								
		}
}