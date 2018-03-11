package com.qa.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchTheOccurrence {

public void occurrenceOfString() throws IOException{
	FileReader f = new FileReader("/Users/rupaliurkude/Desktop/rupali.txt");
	String line;
	String find ="the";
	int Count = 0;

	BufferedReader br = new BufferedReader(f);
	while((line = br.readLine())!=null) {
		String words []= line.split(" "); 
		for(int i =0;i < words.length;i++){
			if (words[i].equals(find)) {
				Count++;
			}
		}
	}
	br.close();	
	
	System.out.println("Count "+ Count);

}
	public static void main(String[] args) {
		SearchTheOccurrence so = new SearchTheOccurrence();
		try {
			so.occurrenceOfString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
