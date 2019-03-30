package com.threads;

import java.util.LinkedList;

public class DemoProducerConsumer {
	
	public static void main(String args[]) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		LinkedList commonList = new LinkedList();
		
		//Set the common linked list object to the static reference
		consumer.setLstCommon(commonList);
		producer.setLstCommon(commonList);
		
		
		consumer.start();
		producer.start();
	}

}
