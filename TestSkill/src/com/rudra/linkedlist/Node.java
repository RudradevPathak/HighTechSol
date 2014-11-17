/**
 * 
 */
package com.rudra.linkedlist;

/**
 * @author Rudradev Pathak
 *
 */
public class Node {
	
	int data;
	Node link;
	
	public Node(){
		
		this.data = 0;
		this.link = null;
	}
	
	public Node(int data, Node link){
		this.data = data;
		this.link = link;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		
		return data;
	}
	
	public void setLink(Node link){
		this.link = link;
	}
    
	public Node getLink(){
		return link;
	}
}
