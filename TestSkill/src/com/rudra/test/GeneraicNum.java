package com.rudra.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class GeneraicNum {

	public static void main(String[] args) {
		
		
	TreeSet map = new TreeSet();
	map.add("one");
	map.add("two");
	map.add("fwo");
	map.add("one");
  Iterator it = map.iterator();
  while (it.hasNext()) {
System.out.println(it.next()+"");
	
}
		
	}

}
class MyException1 extends Exception{
	
}class MyException2 extends MyException1{
	
}
