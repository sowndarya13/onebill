package com.tys.exceptions;

public class Exceptiont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a=new int[4];
		try
		{
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("program end");
	}

}
//if try catch is not given and exception occurs ,program ends abruptly
