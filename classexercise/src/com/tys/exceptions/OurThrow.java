package com.tys.exceptions;

public class OurThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=1;
		try
		{
		throw new ArithmeticException();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("catches arithmetic exception");
		}
		System.out.println("program ends");
	}
}
