package com.enums;

public class MyEnums1 {
	
	public static void main(String[] args)
	{
		Days d1 = Days.MON;
		System.out.println("Day of week: "+d1.getDayOfWeek());
		
		for(Days d : Days.values()) 
		{
			System.out.println(d.toString());
		}
	}
	
	

}


enum Days
{
	MON(1),TUE(2),WED(3),THUR(4),FRI(5),SAT(6),SUN(7);
	
	int dayOfWeek;
	private Days(int dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}
	
	public int getDayOfWeek()
	{
		return dayOfWeek;
	}
}