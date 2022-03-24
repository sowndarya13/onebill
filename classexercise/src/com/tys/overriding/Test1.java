package com.tys.overriding;

public class Test1 extends Test {
	public void message() {
		System.out.println("message received");
	}

	public int add(int x, int y) {
		return x + y + 10;
	}

}
