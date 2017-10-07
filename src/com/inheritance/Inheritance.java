package com.inheritance;

public class Inheritance {
	
    public static void main(String args[])
    {
    	A a1 = new A();
    	A a2 = new B();
    	B b1 = new B();
    	B b2 = new B("Rahul");
    	System.out.println(a2.s);
    	((A)b1).print();
    } 

}


class A
 {
	String s = "Rahul";
	A()
	{
		System.out.println("A's Constructor.");
	}
	public void print()
	{
		System.out.println("In Class A: "+s);
	}
 }

class B extends A
 {
	String s = "Mini";
	B()
	{
		System.out.println("B's constructor.");
	}
	B(String s)
	{
		this();
		System.out.println("B's overloaded constructor.");
	}
	
	public void print()
	{
		System.out.println("In Class B: "+s);
	}
	public void print2()
	{
		System.out.println("In Class B: "+s);
	}
 }