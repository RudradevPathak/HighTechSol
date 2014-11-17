/**
 * 
 */
package com.rudra.consumer.producer;

import java.util.LinkedList;

/**
 * @author Rudradev Pathak
 *
 */
public class ConsumerProducer {
static LinkedList<Integer> list = new LinkedList<Integer>();
static int limit = 10;
static int  value = 0;
static Object lock =new Object();

public static void main(String args[]) throws InterruptedException{
	Thread t1 = new Thread(new Runnable(){
		@Override
		public void run() {
			try {
				produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	});
	Thread t2 = new Thread(new Runnable(){
		@Override
		public void run() {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	});
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
}
private static void produce() throws InterruptedException{
	
	while(true){
		synchronized (lock) {
			while(list.size() == limit){
				lock.wait();
			}
			list.add(value++);
			lock.notify();
		}
		System.out.println("Produce value:"+value +":list size:"+list.size());
	}
	
}

private static void consume() throws InterruptedException{
	while(true){
		synchronized (lock) {
			while(list.size() ==0){
				lock.wait();
			}
			
			list.removeFirst();
			lock.notify();
			
		}
		System.out.println("Consume value:"+value +":list size:"+list.size());
		Thread.sleep(1000);
		
		
	}
}
}
