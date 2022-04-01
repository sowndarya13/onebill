package com.tys.java8;

public class Imple1 implements Interface1,Interface2 {
	public void message()
	{
		Interface1.super.message();//now this is used to access the message() in interface1.can give any implementation here
	}
	
	

}
