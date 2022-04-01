package com.tys.threadinconsistency;

public class Account {
	long balance;

	public Account(long balance) {
		super();
		this.balance = balance;
	}
	public synchronized void withdraw(long amount)
	{
		if(amount<=balance)
			balance-=amount;
	}
	public void deposit(long amount)
	{
		balance+=amount;
	}
	public void getBalance()
	{
		
		System.out.println("the balance left is "+balance);
	}

}
