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
		System.out.print(":"+firstNode.getData()+"\n");
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

	public void readnthNodeFromEnd(int i) {

		Node tmp = firstNode;
		int length = 0;
		while (tmp != null) {
			tmp = tmp.getLink();
			length++;
		}

		tmp = firstNode;
		System.out.println("length:" + length);
		for (int j = 1; j < length - i + 1; j++) {
			tmp = tmp.getLink();
		}
		System.out.println(i + " from end in 2 scan:" + tmp.getData());
	}

	public void readnthNodeFromEndOneScan(int i) {
		Node firstPointer = firstNode;
		Node secondPointer = firstNode;//increment same as i 
		
		for(int j =1; j<i+1;j++){
			secondPointer = secondPointer.getLink();
		}
		while(secondPointer != null){//increment both by one at a time
			secondPointer = secondPointer.getLink();
			firstPointer = firstPointer.getLink();
		}
		
		System.out.println(i+" from end in 1 scan:"+firstPointer.getData());
	}
}
