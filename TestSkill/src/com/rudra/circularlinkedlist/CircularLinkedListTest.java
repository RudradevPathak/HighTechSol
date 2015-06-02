package com.rudra.circularlinkedlist;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertAtFront(900);
		cll.insertAtFront(20);
		cll.insertAtFront(30);
		cll.insertAtFront(40);
		cll.insertAtFront(50);
		cll.insertAtFront(60);
		
		cll.display();
		System.out.println(cll.size());
		cll.isCircularLinkedList();
		int i = (int) cll.isCircularLinkedListOneScan();
		System.out.println("circular :" +(i==1));
		cll.findFirstNodeOfCircularLinkedList();
		
	}

}
