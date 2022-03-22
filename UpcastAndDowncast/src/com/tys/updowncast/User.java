package com.tys.updowncast;

public class User {
	String name;
	long number;
	public User()
	{
		
	}
	public User(String name,long number)
	{
		this.name=name;
		this.number=number;
		System.out.println("user cons");
	}
	public void chat()
	{
		System.out.println(name+" is chatting");
	}
	public void call()
	{
		System.out.println(name+" is calling");
	}
	public void share()
	{
		System.out.println(name+" is sharing");
	}

}
