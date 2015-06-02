package com.rudra.doublylinkedlist;

public class Node {
	
	int data;
	Node prev;
	Node next;
	
	public Node(int data, Node next, Node prev){
		
		this.data=data;
		this.next = next;
		this.prev = prev;
		
	}
	
	public void setNext(Node next){
		
		this.next = next;
	}
   public void setPrev(Node prev){
		
		this.prev = prev;
	}
   public Node getNext(){
		
		return next;
	}
  public Node getPrev(){
		
		return prev;
	}
  
  public void setData(int data){
		
		this.data = data;
	}
 public int getData(){
		
		return data;
	}

}
