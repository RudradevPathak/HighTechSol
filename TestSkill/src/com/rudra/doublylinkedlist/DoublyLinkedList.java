package com.rudra.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	int size;
	
	public Node insertAtFirst(int data){
		Node tmp = new Node(data, head, null);
		if(head == null){
			head = tmp;
			/*head.setNext(null);
			head.setPrev(null);
			head.setData(data);*/
			size ++;
			return head;
		}
		if(head != null){
			tmp.setNext(head);
			head.setPrev(tmp);
		}
		    head = tmp;
		    size ++;
			return tmp;
		}
	
	public int size(){
		return size;
	}

	public void display() {
		Node fs = head;
		if(fs != null){
			System.out.println("List \n:"+fs.getData());
		while (fs.getNext() != null) {
			fs = fs.getNext();
			System.out.println(":" + fs.getData());
		}
		}
	}

	}


