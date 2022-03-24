package com.tys.accessspecifier;

public class Demo {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public void a()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
	private void b()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
	protected void c()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
    void d()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		d.a();
		d.b();
		d.c();
		d.d();
		

	}

}
