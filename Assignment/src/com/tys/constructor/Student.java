package com.tys.constructor;

public class Student {
	String name;
	public Student()
	{
		name="Unknown";
	}
	public Student(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name:"+name);
	}

}
