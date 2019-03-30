package com.threads;

import java.util.LinkedList;
import java.util.List;

public class Producer extends Thread {

	public static LinkedList lstCommon;

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (lstCommon) {
				if (lstCommon != null && lstCommon.isEmpty()) {
					System.out.println("List is empty so adding objects.");
					for (int i = 0; i < 10; i++) 
					{
						System.out.println("Adding item number: " + i);
						lstCommon.add(new Object());
						Thread.sleep(1000);
					}
					System.out.println("Items ready now notifying the consumer.");
					lstCommon.notifyAll();
				} else {
					System.out.println("There are still items in the list hence wait for consumer to finish.");
					lstCommon.wait();
				}
			}
		}
	}

	@Override
	public void run() {
		try {
			this.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static List getLstCommon() {
		return lstCommon;
	}

	public static void setLstCommon(LinkedList lstCommon) {
		Producer.lstCommon = lstCommon;
	}

}
