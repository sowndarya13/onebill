package com.tys.methodreference;

public class MainClass {
	public void test(String s) {
		System.out.println(s);
	}

	public static void chat(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "all is well";
		MainClass m = new MainClass();
		MyInterface e = MainClass::chat;
		e.message(s);
		s = "hello all";
		MyInterface e1 = m::test;
		e1.message(s);
	}

}
