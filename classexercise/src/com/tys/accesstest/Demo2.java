package com.tys.accesstest;

import com.tys.accessspecifier.Demo;

public class Demo2 extends Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Demo2 d2=new Demo2();
		System.out.println(d.a);//public so accessible even outside pacakage
		//System.out.println(d.b);
		//System.out.println(d.c);
		//System.out.println(d.d);//default accessible only within same package within same or different classes
		d.a();//public so possible outside class
		//d.b();
		//d.c();PROTECTED SO WITHOUT INHERITANCE AND WITHOUT OBJECT OF DERIVED CLASS CAN'T BE ACCESSED
		//d.d();
		System.out.println(d2.c);
		d2.c();

	}

}
