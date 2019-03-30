package com.threads;

import java.util.LinkedList;
import java.util.List;

public class Consumer extends Thread{

	public static LinkedList lstCommon;

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (lstCommon) {
				if (lstCommon != null && lstCommon.isEmpty()) {
					System.out.println("List is empty, hence waiting for producer to produce.");
					lstCommon.wait();					
				} else {
					System.out.println(lstCommon.size() +" items found in the list, hence consuming.");
					int i =0;
						while(!lstCommon.isEmpty()) 
						{
							System.out.println("Consuming item number: "+ i++);
							lstCommon.removeFirst();
							Thread.sleep(1000);
						}
					System.out.println("All items consumed now notifying producer to produce.");
					lstCommon.notifyAll();
				}
			}
		}
	}

	@Override
	public void run() {
		try {
			this.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static List getLstCommon() {
		return lstCommon;
	}

	public static void setLstCommon(LinkedList lstCommon) {
		Consumer.lstCommon = lstCommon;
	}
	
	

}
