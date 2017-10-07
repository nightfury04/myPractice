package com.casting;

public class Casting {

	public static void main(String args[]) {
		
		Family a  = new Motu();
		Motu m = new Motu();
		Family f = new Family();
		a.print();
	}

}

class Minu extends Motu{
	public void print() {
		System.out.println("Minu Class");
	}
	public void minuMethod()
	{
		System.out.println("MInu");
	}
}

class Motu  extends Family{
	public void print() {
		System.out.println("Motu Class");
	}
	
	public void motuMethod()
	{
		System.out.println("Motu");
	}
}

class Family {
	public void print() {
		System.out.println("Family Class");
	}
	
	public void familyMethod()
	{
		System.out.println("Family");
	}
}