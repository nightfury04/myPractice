package com.threads.evenodd;

public class Printer {

	public void print(int number) 
	{
		System.out.println(Thread.currentThread().getName() + "..................." + "Printing number: " + number);
	}
	
}
