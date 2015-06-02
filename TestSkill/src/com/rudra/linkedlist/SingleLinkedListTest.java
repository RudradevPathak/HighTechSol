/**
 * 
 */
package com.rudra.linkedlist;

/**
 * @author Rudradev Pathak
 *
 */
public class SingleLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		LinkedList ls = new LinkedList();
		ls.insertAtFirst(20);
		//System.out.println(ls.size());
		ls.insertAtLast(30);
		//System.out.println(ls.size());
		ls.insertAtPostion(40, 1);
		ls.insertAtPostion(50, 2);
		ls.insertAtLast(60);
		ls.insertAtLast(80);
		ls.insertAtLast(70);
		ls.insertAtLast(90);
		//System.out.println(ls.size());
		//ls.displayData();
		ls.deleteAtFirst();
		//ls.displayData();
		//System.out.println(ls.size());
		//ls.deleteAtLast();
		ls.displayData();
		System.out.println("size:"+ls.size());
		ls.readnthNodeFromEnd(3);
		ls.readnthNodeFromEndOneScan(3);
	}
	

}
