package com.rudra.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadLog {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new FileReader("C://Users/User/Desktop/logs/trackidLive.txt"));
		String line ;
		int i = 0;
		Set<Integer> listPin = new HashSet<Integer>();
		
		 FileWriter writer = new FileWriter("C://Users/User/Desktop/logs/LogData.txt");
		while ((line = br.readLine()) != null) {
			
			//give your input here to read your contect line
			if(line.contains("pincode")){
				i++;
				line = line + "\n";
	            // Writes the content to the file
	            writer.write(line); 
		}
		}
		String total = "Total pincode line : " + String.valueOf(i);
		  writer.write(total);
		  br.close();
		  writer.close();
	 
	}

}
