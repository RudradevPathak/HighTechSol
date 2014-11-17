package com.rudra.myqueue;


public class MyQueue {
	int maxSize = 4;
	int queue[] = new int[maxSize];
	int nqueue[];
int rear = -1;
int front = -1;
boolean copyArray = true;

private void enQueue(int data){

	if(rear < maxSize-1)
	queue[++rear] = data;
	else{
		 if(copyArray){
			 nqueue = new int[maxSize*2] ;
		 for (int i = 0; i < queue.length; i++) {
			 nqueue[i] = queue[i];
			 copyArray = false;
		  }
		 nqueue[++rear]=data;
		 }else{
			 nqueue[++rear]=data;
		 }
	}
	
}

private void deQueue(){
	if(front < maxSize-1)
	   queue[++front] = 0;
	else{
		 
		nqueue[++front] = 0;
	}
}


public void displayQueue(){
	if(rear!=-1){
		if(copyArray){
		for (int i = 0; i < queue.length; i++) {
			System.out.println("queue element:"+queue[i]);
		}
		}
		else{
			for (int i = 0; i < nqueue.length; i++) {
				System.out.println("queue element:"+nqueue[i]);
			}
		}
		
	}
}

public static void main(String[] args) {
	MyQueue mq = new MyQueue();
	mq.enQueue(2);
	mq.enQueue(4);
	mq.enQueue(2);
	mq.enQueue(4);
	mq.displayQueue();
	mq.deQueue();
	mq.deQueue();
	System.out.println("after deQueue");
	mq.displayQueue();
	mq.enQueue(5);
	mq.enQueue(6);
	mq.enQueue(5);
	mq.enQueue(6);
	System.out.println("after enQueue");
	mq.displayQueue();
	
}

}