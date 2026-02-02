package com.bristlecone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestReadWriteObject {
	public static void main(String[] args) {
//		Product product = new Product("Laptop", 56000);
//		// done when user goes to idle state
//		writeToFile(product);
		// done when user becomes active
		Product p = readFromFile();
		System.out.println("Name = "+p.getName()+", Price = "+p.getPrice());
	}
	
	public static void writeToFile(Product product) {
		try {
			FileOutputStream fos = new FileOutputStream("products.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(product);
			fos.flush();
			fos.close();
			System.out.println("Object serialized....");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Product readFromFile() {
		try {
			FileInputStream fis = new FileInputStream("products.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Product p = (Product)ois.readObject();
			fis.close();
			return p;
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
