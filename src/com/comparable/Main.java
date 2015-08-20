package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
	
	public static void main(String args[])
	{
		Employee a = new Employee("a",20000,20);
		Employee b = new Employee("b",21000,21);
		Employee c = new Employee("c",22000,22);
		Employee d = new Employee("d",23000,23);
		
		List<Employee> lstEmployees = new ArrayList<Employee>();
		lstEmployees.add(d);
		lstEmployees.add(a);
		lstEmployees.add(c);
		lstEmployees.add(b);
		
		//unsorted
		System.out.println("Unsorted list:");
		
		for(Employee emp : lstEmployees)
		{
			System.out.println("Name:"+emp.getName() +" Salary: "+emp.getSalary() +"Age: "+emp.getAge());
		}
		
		//Sorted
		System.out.println("Sorted list:");
		
		Collections.sort(lstEmployees);
		for(Employee emp : lstEmployees)
		{
			System.out.println("Name:"+emp.getName() +" Salary: "+emp.getSalary() +"Age: "+emp.getAge());
		}
	}
	
	
	
	

}
