package com.rudra.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDuplicateWordCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new FileReader("E://RudraData/logs/data.txt"));
	

	String dt[]= (br.readLine()).split(" ");
	int dtl = dt.length;

	//System.out.println(dt.length);
	for(int j=0; j< dtl; j++) {
		int i = 1;
		String pw = dt[j];
		for(int k=j+1; k< dtl-1; k++) {
		String nw = dt[k];
			if(pw.equalsIgnoreCase(nw)){
				i++;
				System.out.println("word:"+pw+":times:"+i);
			}
		}
	}

}
}
