package com.tys.abstracttype;

public abstract class Abstract {
	int x;
	static int y;

	public Abstract(int x) {
		this.x = x;
	}

	abstract void m1();

	void m2() {
		System.out.println("x=" + x);
	}

}
