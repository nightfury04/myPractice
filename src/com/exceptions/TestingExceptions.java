package com.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestingExceptions {

	public static void main(String[] args) {
		
	try {
		System.out.println("Running application");
		throw new RuntimeException();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Rahul");
	}
	
	}

}
