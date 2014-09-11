package com.rudra.test;

import java.util.ArrayList;
import java.util.List;



public class FastStringReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> searchCollection = new ArrayList<String>();
		searchCollection.add("ABCD");
		searchCollection.add("ABCDEF");
		searchCollection.add("xyz");
		searchCollection.add("xyza");
		String  searchString = "xyz";
containsAny(searchString, searchCollection);
	}

	
	public static boolean containsAny(String searchString, List<String> searchCollection) {
	    int size = searchCollection.size();
	    for (int i = 0; i < size; i++) {
	        String stringInCollection = searchCollection.get(i);
	        if (stringInCollection != null && stringInCollection != "") {
	            // This is a performance optimization of contains.
	            if (searchString.indexOf(stringInCollection, 0) > -1) {
	            	System.out.println("searchString:::"+searchString);
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
}
