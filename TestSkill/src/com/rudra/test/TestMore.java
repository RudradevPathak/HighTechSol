package com.rudra.test;
//palaendrom
public class TestMore {

	public static void main(String[] args) {

		String s = "abcdedcba";
	
		char[] a = s.toCharArray();
		System.out.println(a);
		char c = ' ';
		String d = " ";
		for (int i = 0; i < a.length; i++) {
			 c =  a[i];
			 d = d + c ;
			
		}
	
		System.out.println(d.trim());
		
		if(s.length()%2 != 0){
			
		  int j = s.length()/2;
		  
		  int mindex = j;
		  System.out.println(mindex);
		  System.out.println(s.charAt(mindex));
		  boolean palc = false;
		  for (int i = 0; i < s.length(); i++) {
			  if(!(s.charAt(i) == s.charAt(s.length()-i-1))){
				  palc = true;
				  break;
			  }
		}
		  if(palc)
		  System.out.println("check is done, not a palandrom");
		  else
			  System.out.println(" a palandrom");
			  
		  
		 
		}
		
		
}

}
