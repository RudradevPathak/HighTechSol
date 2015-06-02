package com.rudra.circularlinkedlist;

import com.rudra.linkedlist.Node;

public class CircularLinkedList {

	int size;
	Node start;
	Node end;

	public void insertAtFront(int data) {

		Node newNode = new Node(data, null);
		newNode.setLink(start);
		if (start == null) {
			start = newNode;
			newNode.setLink(start);
			end = start;
		} else {
			end.setLink(newNode);
			start = newNode;
		}

		size++;

	}

	public int size() {
		return size;
	}

	public void display() {

		Node tmp = start;
		if (tmp != null) {
			System.out.println(tmp.getData());
			while (tmp.getLink() != start) {
				tmp = tmp.getLink();
				System.out.println(tmp.getData());
			}
		}
	}

	public void isCircularLinkedList() {
		Node tmp = start;
		while(tmp.getLink() != start){
			tmp = tmp.getLink();
			System.out.println(tmp.getData() +":no:"+start.getData());
		}
		tmp = tmp.getLink();
		System.out.println(tmp.getData() +":yes:"+start.getData());
		System.out.println("isCircularLinkedList:yes"); 
	}

	public int isCircularLinkedListOneScan() {
		
		Node slowPtr = start;
		Node fastPtr = start;
		while(slowPtr != null && null != fastPtr){
			fastPtr = fastPtr.getLink();
			if(fastPtr == slowPtr){
				System.out.println("fastPtr == slowPtr 1 circular=yes");
				return 1;
			}
			if(fastPtr == null){
				System.out.println("circular = no");
				return 0;
			}
			fastPtr = fastPtr.getLink();
			if(fastPtr == slowPtr){
				System.out.println("fastPtr == slowPtr 2 circular =yes");
				return 1;
			}
			slowPtr = slowPtr.getLink();
			
		}
		return 0;
	}

	public void findFirstNodeOfCircularLinkedList() {
		Node fastPtr = start;
		Node slowPtr = start;
		boolean circularLoop = false;
		while(fastPtr != null && slowPtr != null){
			 fastPtr = fastPtr.getLink();
			 if(fastPtr == slowPtr){
				 circularLoop = true;
				 break;
			 }
			 if(fastPtr==null){
				 circularLoop = false;
				 break;
			 }
			 fastPtr = fastPtr.getLink();
			 if(fastPtr == slowPtr){
				 circularLoop = true;
				 break;
			 }
		}
		if(circularLoop){
			slowPtr = start;
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.getLink();
				fastPtr = fastPtr.getLink();
			}
			System.out.println("its a start ptr: "+slowPtr.getData());
		}
		
	}

}
