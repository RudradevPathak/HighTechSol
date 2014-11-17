/**
 * 
 */
package com.rudra.test;

import java.util.ArrayList;

/**
 * @author User
 *
 */
public class Test {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Test");
     
      //1 to 100 prime number
    
      
      for (int i = 1; i < 100; i++) {
    	  boolean prime = false;
    	  if(i/i == 1){
    		  
    		  for (int j = 2; j < i; j++) {
				if(i%j == 0){
					
					prime= true;
					break;
					
				}
			}
    		 
    	  }
    	  if(!prime)
    		  System.out.println("prime number : " + i); 
	}
      
    
     
      
	}

}
