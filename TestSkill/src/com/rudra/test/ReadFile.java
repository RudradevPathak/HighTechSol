/**
 * 
 */
package com.rudra.test;

import java.io.FileReader;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2000000000;
		System.out.println(n*n);
		add(1/2);
		//add(3.14);
		Dog d = new Dog();
		Scanner inFile;
		String value = "";
		String arrayString = "";
		StringBuilder sb = new StringBuilder();
		try {
		        inFile = new Scanner(new FileReader("D:/Software/hellos.txt"));
		        value = inFile.next();
		        while (inFile.hasNextLine()) {
		           sb.append(value);
		           value = inFile.next();
		    }

		    arrayString = sb.toString(); // Not executing
		    System.out.println(arrayString); // Not executing
		    //inFile.close();

		} catch (Exception e) {
		    System.out.println("Error: File not found.");
		} finally {
		    // inFile.close();
		}
		   System.out.println(arrayString); // Not executing
		}

	private static void add(float i) {
		// TODO Auto-generated method stub
		System.out.println("f+PI="+i+3.14);
	}
	

}

class Dog {
	public Dog(){
		Dog("MAx");
	}
	public Dog(String name){
		System.out.println(name);
	}
	public void Dog(String name){
		System.out.println("AA");
	}

}
