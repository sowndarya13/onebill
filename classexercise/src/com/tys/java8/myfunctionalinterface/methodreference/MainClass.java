package com.tys.java8.myfunctionalinterface.methodreference;

public class MainClass {
	public void test()
	{
		System.out.println("hello");
	}
	public static void chat()
	{
		System.out.println("all is well");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		MyInterface e=MainClass::chat; 
		e.message();
		MyInterface e1=m::test;
		e1.message();
		
		

	}

}
