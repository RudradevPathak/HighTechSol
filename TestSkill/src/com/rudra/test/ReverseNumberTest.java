package com.rudra.test;

public class ReverseNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1235;
		int reverse = 0;
		int reminder = 0;
		do{
			reminder = number%10;
			System.out.println("reminder::"+reminder);
			reverse = reverse*10 + reminder;
			System.out.println("reverse::"+reverse);
			number = number/10;
			System.out.println("number::"+number);
		}while(number>0);
			
		
		
		System.out.println("reverse:"+reverse);
	
       
	}

}
