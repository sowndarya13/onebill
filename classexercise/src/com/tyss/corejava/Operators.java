package com.tyss.corejava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nunary");
		int a=20;
		System.out.println(a);//20
		System.out.println(a++);//20
		System.out.println(--a);//20
		System.out.println(~a);//-21
		System.out.println("\narithmetic");
		int b=30;
		System.out.println(a+b);//50
		System.out.println(a-b);//-10
		System.out.println(a*b);//600
		System.out.println(a/b);//0
		System.out.println(a%b);//20
		float c=10.5f,d=20;
		System.out.println(c/d);//0.525
		double e=c/d;//0.524999...
		System.out.println(e);
		System.out.println("\nrelational");
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println("\nlogical");
		System.out.println(a>b&&a>c);
		System.out.println(a<b||a<c);
        System.out.println("\n\nbitwise");
        System.out.println(10&2);
	}

}
