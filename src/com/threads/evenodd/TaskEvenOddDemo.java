package com.threads.evenodd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskEvenOddDemo {
	private static volatile Printer p = new Printer();
	private static volatile Integer num = 1;
	private static ExecutorService service;
	public static void main(String[] args) 
	{
		
		EvenNumberProducer evenProducerThread = new EvenNumberProducer(p, num);
		OddNumberProducer oddProducerThread = new OddNumberProducer(p, num);
//		evenProducerThread.start();
//		oddProducerThread.start();
		service = Executors.newFixedThreadPool(2);
		service.submit(evenProducerThread);
		service.submit(oddProducerThread);
		service.shutdown();
	}

}
