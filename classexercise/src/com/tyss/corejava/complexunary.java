package com.tyss.corejava;

public class complexunary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=30,c=40;
		System.out.println(a<b && ++c>b);//true
		System.out.println(a++>b || ++c < b);//false
		System.out.println(a++>b || ++c < b++);//false
		System.out.println(c);//43
		System.out.println(a);//22
		System.out.println(b);//31
		a=20;b=30;c=40;
		System.out.println("\n\n");
		System.out.println(a>b && ++c>b);//false
		System.out.println(a++<b || ++c < b);//true
		System.out.println(a++<b || ++c < b++);//true
		System.out.println(c);//40
		System.out.println(a);//22
		System.out.println(b);//30


	}

}
