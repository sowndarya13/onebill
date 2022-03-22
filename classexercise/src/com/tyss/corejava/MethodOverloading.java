package com.tyss.corejava;

public class MethodOverloading {
	 static void add(int a,int b)
	 {
		 int sum=a+b ;
		 System.out.println(sum);
	 }
	 static void add(double a,double b)
	 {
		 double sum=a+b;
		 System.out.println(sum);
	 }
	 static void add(double a,double b,double c)
	 {
		 double sum=a+b+c;
		 System.out.println(sum);
	 }
	 static void add(double a,int b)
	 {
		 double sum=a+b;
		 System.out.println(sum);
	 }
     void add(int a,double b)
	 {
		 double sum=a+b;
		 System.out.println(sum);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		double x=5,y=6,z=7;
		MethodOverloading m=new MethodOverloading();
		MethodOverloading.add(x,y);
		MethodOverloading.add(x,y,z);
		MethodOverloading.add(a,b);
		MethodOverloading.add(x,a);
		m.add(a,x);
		

	}

}
