package com.bristlecone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		try {
			// demo.txt must be in the project folder - root folder
			FileReader reader = new FileReader("demo.txt");
			// buffered reader can load entire line into the buffer once
			BufferedReader buffer = new BufferedReader(reader); 
			//to write the file you can use BufferedWriter + FileWriter
			FileWriter writer = new FileWriter("test.txt");
			BufferedWriter buffer2 = new BufferedWriter(writer);
			int counter = 0;
			String line = null;
			do {
				line = buffer.readLine();
				if(line != null) {
					buffer2.write(line);
					buffer2.newLine();
					buffer2.flush();
				}
				counter++;
			} while(line != null);
			System.out.println("Loop count = "+counter);
			buffer2.close();
			writer.close();
			buffer.close();
			reader.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
