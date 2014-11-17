/**
 * 
 */
package com.rudra.linkedlist;

/**
 * @author Rudradev Pathak
 *
 */
public class LinkedList {

	Node firstNode;
	Node lastNode;
	int size;
	
	public LinkedList(){
		
		this.firstNode = null;
		this.lastNode = null;
		this.size = 0;
	}
	
	public boolean isEmpty(){
		return firstNode == null;
	}
	
	public int size(){
		return size;
	}
	
	public void insertAtFirst(int data){
	    Node node = new Node(data, null);
	    size++;
	    if(firstNode == null){
	    	firstNode = node;
	    	lastNode = firstNode;
	    }
	    else{
	    	node.setLink(firstNode);
	    	firstNode = node;
	    }
	}
	
	public void insertAtLast(int data){
		Node node = new Node(data, null);
		size++;
		if(firstNode == null){
			firstNode = node;
			lastNode = firstNode;
		}
		else{
			lastNode.setLink(node);
			lastNode = node;
		}
	}
	
	public void insertAtPostion(int data, int pos){
		Node node = new Node(data, null);
		Node pointer = firstNode;
		for(int i=0; i < size-1; i++){
			if(i == (pos-1)){
				Node tmpNode = pointer.getLink();
				pointer.setLink(node);
				node.setLink(tmpNode);
				break;
			}
			pointer = pointer.getLink();
		}
		size++;
	}
	
	public void displayData(){
		System.out.println("Display list data");
		if(size == 0){
			System.out.println("List is Empty");
			return;
		}
		
		if(firstNode.getLink() == null){
			System.out.println("Only one element:"+ firstNode.getData());
			return;
		}
		Node pointer = firstNode;
		System.out.print(firstNode.getData());
		 pointer = firstNode.getLink();
		while(pointer.getLink() != null){
			System.out.println( ":"+pointer.getData());
			pointer = pointer.getLink();
		}
		System.out.println( ":"+pointer.getData());
	}
	
	public void deleteAtFirst(){
		if(size == 0){
			System.out.println("List is Empty");
			return;
		}
		else{
			if(firstNode == lastNode){
				firstNode = null;
				lastNode = null;
			}else {
				firstNode = firstNode.getLink();
			}
		
		}
		size--;
	}
	
	public void deleteAtLast(){
		if(size == 0){
			System.out.println("List is Empty");
			return;
		}
		else{
			if(firstNode == lastNode){
				firstNode = null;
				lastNode = null;
			}else {
				Node previousToTail = firstNode;
				while (previousToTail.getLink() != lastNode) {
					previousToTail = previousToTail.getLink();
					lastNode = previousToTail;
					lastNode= lastNode.getLink();
					lastNode = null;
					
				}
				
			}
		
		}
		size--;
	}
}
