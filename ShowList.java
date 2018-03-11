package com.qa.File;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ShowList {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/rupaliurkude/Desktop/Folder");
				String lists[] = file.list();
				Arrays.sort(lists);
				for(int i =0;i<lists.length;i++){
					System.out.println(lists[i]);
				}
	}

}
