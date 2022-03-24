package com.tys.abstracttype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete c=new Concrete(5);
		c.m2();
		c.m1();
		Abstract.y=5;
		System.out.println(Abstract.y);

	}

}
