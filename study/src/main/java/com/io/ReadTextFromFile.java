package com.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {

	public static void main(String[] args) {
		String path = "src/main/java/com/io/data/hello.txt";
		try(FileReader fr = new FileReader(path)) {
			
			int value = 0;
			while((value = fr.read()) != -1) {
				//System.out.println(value);
				//System.out.println((char)value);
				char c = (char)value;
				System.out.print(c);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
