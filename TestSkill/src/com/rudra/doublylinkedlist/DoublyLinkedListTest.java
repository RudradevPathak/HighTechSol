package com.rudra.doublylinkedlist;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DoublyLinkedList dll = new DoublyLinkedList();
     dll.insertAtFirst(20);
     dll.insertAtFirst(30);
     dll.insertAtFirst(40);
     dll.insertAtFirst(80);
     dll.insertAtFirst(20);
     dll.insertAtFirst(30);
     dll.insertAtFirst(40);
     dll.insertAtFirst(90);
     System.out.println("size:"+dll.size());
     dll.display();
	}

}
