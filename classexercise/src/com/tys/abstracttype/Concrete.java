package com.tys.abstracttype;

public class Concrete extends Abstract  {//while extending abstract class the subclass has to be made abstract or th eabstract method of super shoud be overridden
	void m1(){
		System.out.println("overridden");
		
	}
	public Concrete(int x) {
		super(x);
	}

}
