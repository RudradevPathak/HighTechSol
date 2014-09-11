package com.rudra.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class SnapDeal {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/
		
        List inputs = new ArrayList();
        inputs.add("2");
        inputs.add("100 2");
        inputs.add("33 3");
        
        List readInput = new ArrayList();
        int N = 3;
        
        for (int i = 0; i < N; i++) {
        	String a = (String) inputs.get(i);
        	System.out.println(a);
        	String[] spl = a.split(" ");
        	for(String s : spl){
        		readInput.add(s);
        		
        	}
        	
        }
        
        System.out.println(readInput);
        Collections.reverse(readInput);
        System.out.println(readInput);
        String f = " ";
        for(Object str: readInput){
        	
        	f = f + " " + str;
        }
System.out.println(f.trim());
	}

}
