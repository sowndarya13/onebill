package com.tys.superandthis;

public class Child extends Parent {
	int a,b,c,z,d;
	Child(int a,int b,int c,int x,int y)
	{
		super(x,y);
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("child cons with 5 parameter");
	}
	Child(int a,int b,int c,int z,int x,int y)
	{
		this(a,b,c,x,y);
		this.z=z;
		System.out.println("child cons with 6 parameter");
	}
	Child(int a,int b,int c,int d,int x,int y,int z)
	{
		this(a,b,c,z,x,y);
		this.d=d;
		System.out.println("child cons with 7 parameter");
	}
	Child()
	{System.out.println("child cons with 0 parameter");
	}

}
