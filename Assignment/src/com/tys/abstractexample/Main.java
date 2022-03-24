package com.tys.abstractexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a=new BankA();
		a.setBalance(100);
		BankB b=new BankB();
		b.setBalance(150);
		BankC c=new BankC();
		c.setBalance(200);
		System.out.println("bank A balance:"+a.getBalance());
		System.out.println("bank B balance:"+b.getBalance());
		System.out.println("bank C balance:"+c.getBalance());

	}

}
