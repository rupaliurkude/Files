package com.qa.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContent {
	
	public void copy( ) throws IOException{
		
			String line;
			
			try {
				FileReader file1 = new FileReader("/Users/rupaliurkude/Desktop/rup.txt");
				FileWriter file2 = new FileWriter("/Users/rupaliurkude/Desktop/rupali.txt");
				BufferedReader br = new BufferedReader(file1);
				BufferedWriter bw = new BufferedWriter(file2);
				while((line =br.readLine())!= null){
					bw.write(line);
				}
					bw.close();
					br.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

	
	}
		
public static void main(String[]arg){
	 CopyContent cc = new  CopyContent();
	 try {
		cc.copy( );
		System.out.println("Done");
	} catch (IOException e) {		e.printStackTrace();
	}
	 
}

}
