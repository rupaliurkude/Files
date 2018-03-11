package com.qa.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindAndReplace {
	public  void findAndReplace(String path,String copy1,String newString) throws IOException {
		File f = new File("//Users/rupaliurkude/Desktop/rupali.txt");
		String copy =" ";
		BufferedReader br =new BufferedReader(new FileReader(f));
		String line =br.readLine();
		while(line!=null){
			copy= copy+line+System.lineSeparator();
			line =br.readLine();
		}
		String newContent = copy.replaceAll(copy1, newString);
		FileWriter fw = new FileWriter(f);
			fw.write(newContent);
			fw.flush();
			fw.close();
			br.close();
		
		
	}
	public static void main(String[] args) throws IOException {
		FindAndReplace fr = new FindAndReplace();
		fr.findAndReplace("/Users/rupaliurkude/Desktop/rup.txt"," hi", "hello");
		System.out.println("done");
	}

}
