package com.rudra.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abc";
	     String s1= new String("abc");
	     System.out.println(s1==s);
	     System.out.println(s.equals(s1));
	     String s2 = new String("abc");
	     System.out.println(s2.equals(s1));
	}

}
