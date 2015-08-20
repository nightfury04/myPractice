package com.comparator;

import java.util.Comparator;

public class Employee{
	
	
	String name;
	int salary;
	int age;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
