package com.tys.NarrowingAndWidening;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		byte b=20;
		//byte res =a+b;//error bcoz two bytes get added and result in memory more than byte it may be a int value
		int res=a+b;
		System.out.println("res:"+res);
		char x=97;
		System.out.println(x);
		int y='a';
		System.out.println(y);
	}

}
