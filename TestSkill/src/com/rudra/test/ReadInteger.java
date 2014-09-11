package com.rudra.test;

import java.util.ArrayList;

public class ReadInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList ls = new ArrayList();
	      
	      ls.add("1");
	      ls.add(2);
	      ls.add("3");
	   

	  
	      for (Object obj: ls) {
	    	    if (obj instanceof String){
	    	       System.out.println("String"+obj);
	    	    } else if (obj instanceof Integer) {
	    	    	System.out.println("Integer"+obj);
	    	    }
	      }
	}

}
