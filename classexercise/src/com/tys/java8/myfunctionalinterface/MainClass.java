package com.tys.java8.myfunctionalinterface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface m=(a,b)->{//here can mention the argument data type also.can give different arg names here
			//may or may not like same as in interface
			return a+b;
		};
		int c=m.add(10, 20);
		System.out.println(c);

	}

}