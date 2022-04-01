package com.tys.threadinconsistency;public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(100000);
		Husband hus=new Husband(account);
		Wife wife=new Wife(account);
		hus.start();
		wife.start();
		try
		{
			Thread.sleep(1000);
			account.getBalance();
		}
		catch(Exception e) {}
		
     }

}
