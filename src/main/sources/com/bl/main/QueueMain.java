package com.bl.main;

import com.bl.queue.QueueUsingLinkedListMain;

public class QueueMain {
	public static void main(String a[]){
		 
		 QueueUsingLinkedListMain queue = new QueueUsingLinkedListMain();
		 queue.enqueue(56);
		 queue.enqueue(30);
		 queue.enqueue(70);
		 queue.dequeue();
		 queue.dequeue();
		 queue.dequeue();
		 
		 }
}
