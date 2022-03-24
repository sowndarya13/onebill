 package com.tys.accessspecifier;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println(d.a);
		//System.out.println(d.b);private can't be accesed outside from where it is declared
		System.out.println(d.c);
		System.out.println(d.d);
		d.a();
		//d.b();
		d.c();
		d.d();

	}

}
