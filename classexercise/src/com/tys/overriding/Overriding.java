package com.tys.overriding;

public class Overriding {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.message();
		System.out.println(t.add(10, 20));
		Test t2 = new Test();
		t2.message();
		System.out.println(t2.add(10, 20));
		//Test t3=new Test1(); 
		//System.out.println(t3.add(10,20));

	}
}
