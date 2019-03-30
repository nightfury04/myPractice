package com.immutable;

import java.util.HashMap;

public class ImmutableDemo {
	
	
	

}



final class MyImmutable 
{
	final String name;
	final Integer age;
	final Integer id;
	final HashMap hmRelation;
	
	
	public MyImmutable(String name, Integer age, Integer id, HashMap hmRelation) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.hmRelation = hmRelation;
	}


	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}


	public Integer getId() {
		return id;
	}


	public HashMap getHmRelation() {
		return hmRelation;
	}
	
}
