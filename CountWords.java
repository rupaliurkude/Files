package com.qa.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) throws IOException {
		int wordCount =0;
		int lineCount = 0;
		int charCount = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/rupaliurkude/Desktop/rupali.txt"));
			String currentLine = br.readLine();
			while(currentLine!=null){
				lineCount++;
				String[] words = currentLine.split(" ");
				 wordCount = wordCount +words.length;
					for(String word:words){
						charCount=charCount+word.length();
					}
				currentLine =br.readLine();
			
			}
			
		System.out.println("CharCount:"+charCount);
		System.out.println("wordCount:"+wordCount);
		System.out.println("lineCount:"+lineCount);
		

		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}


}
	


