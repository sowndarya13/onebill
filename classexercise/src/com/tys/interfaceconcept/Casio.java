package com.tys.interfaceconcept;

public class Casio implements Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stud
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiple(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	public void display()
	{
		System.out.println("calci");
	}
	

}
