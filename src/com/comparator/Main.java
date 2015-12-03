package com.comparator;

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
		try {
			System.out.println("Unsorted list:");
			throw new Exception();
		} catch (java.io.IOException exc) {
            System.err.println("In catch IOException: "+exc.getClass());
            throw new RuntimeException();
        } catch (Exception exc) {
            System.err.println("In catch Exception: "+exc.getClass());
        } finally {
            System.err.println("In finally");
        }
		
		for(Employee emp : lstEmployees)
		{
			System.out.println("Name:"+emp.getName() +" Salary: "+emp.getSalary() +"Age: "+emp.getAge());
		}
		
		//Sorted
		System.out.println("Sorted list:");
		
		Collections.sort(lstEmployees, new EmployeeComparatorBySalary());
		for(Employee emp : lstEmployees)
		{
			System.out.println("Name:"+emp.getName() +" Salary: "+emp.getSalary() +"Age: "+emp.getAge());
		}
	}
	
	
	
	

}
