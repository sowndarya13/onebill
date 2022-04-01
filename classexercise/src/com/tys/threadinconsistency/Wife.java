package com.tys.threadinconsistency;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++)
			account.withdraw(100);
	}
	

}
