package com.exceptions;

public class TestingExceptions {

	public static void main(String[] args) throws MyException {
		
	try {
		System.out.println("Rahul");
		throw new RuntimeException();
	} catch (Exception e) {
		throw new MyException("I have thrown a custom exception.");
	}
	
	}

}
