package com.tys.java8.lambdaexpression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {//without implementation class ,we can use interface that has only one unimplemented class
			//using lambda expression
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}

		};
		Thread thread=new Thread(r);
		thread.start();
	}

}
