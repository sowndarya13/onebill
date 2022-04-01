package com.tys.exceptions;

public class Bank {
	private long Balance;

	public Bank() {
		Balance = 10000l;	
	}
	public void getBalance()
	{
		System.out.println(Balance);
	}
	public void withdraw(int withdraw)
	{
		if(this.Balance>=withdraw)
		{
			Balance=Balance-withdraw;
			System.out.println("Amount withdraw");
		}
		else
		{
			try
			{
				throw new Insufficient("insufficient balance");
			}
			catch(Insufficient e)
			{
				e.printStackTrace();
			}
		}
	}
	public void deposit(long deposit)
	{
		if(deposit<=0)
		{
			try
			{
				throw new Valuable("mention valuable amount to be deposited");
			}
			catch(Valuable e)
			{
				e.printStackTrace();
			}
		}
		else
		{
		Balance=Balance+deposit;
		}
	}
	
	

}