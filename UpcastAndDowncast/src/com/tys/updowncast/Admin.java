package com.tys.updowncast;

public class Admin extends User {
	Admin(String name,long number)
	{
	   super(name,number);
	   System.out.println("admin cons");
	}
	public void addUser(String Name)
	{
		System.out.println(Name+" is added");
	}
	public void removeUser(String Name)
	{
		System.out.println(Name+" is removed");
	}
	

}
