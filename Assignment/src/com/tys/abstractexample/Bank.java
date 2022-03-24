package com.tys.abstractexample;

public abstract class Bank {
	long Balance;
	void setBalance(long Balance)
	{
		this.Balance=Balance;
	}
	abstract long getBalance();
}