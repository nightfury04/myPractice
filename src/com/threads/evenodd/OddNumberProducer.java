package com.threads.evenodd;

public class OddNumberProducer extends Thread {
	Printer p;
	int num;
	
	public OddNumberProducer(Printer p, int num) {
		super();
		this.p = p;
		this.num = num;
	}
	
	@Override
	public void run() {
		try {
			synchronized (p) {
				while (true) {
					if (num % 2 != 0) {
						p.print(num);
						Thread.sleep(1000);
						p.notifyAll();
					} else {
						p.wait();
					}
					num++;
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
