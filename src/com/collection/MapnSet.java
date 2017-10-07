 package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapnSet {
	
	public static void main(String args[])
	{
		Map<Dept,String> map = new HashMap<Dept,String>();
		Dept d1 = new Dept("Maths",100);
		Dept d2 = new Dept("Maths",100);
		map.put(d1,"100 Students");
		map.put(d2,"100 Students");
		map.put(null, "200 Students");
		System.out.println("Location 1 : "+map.size());
		
		Set<Dept> set = new HashSet<Dept>();
		set.add(d1);
		set.add(d2);
		System.out.println("Location 2 : "+set.size());
	}
	
	

}


class Dept
{
	private String deptname;
	private int noOfStudents;
	
	
	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	
	
	public Dept(String deptname,int noOfStudents)
	{
		this.deptname = deptname;
		this.noOfStudents=noOfStudents;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Dept)
		{
			return this.deptname.equals(((Dept)obj).deptname);
		}
		else
		{
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.noOfStudents*5;
	}
	
	
}