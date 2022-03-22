package com.tys.tables;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,i;
		System.out.println("enter the no. for which the tables has to be printed and also the bottom no.:");
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		n1=t.nextInt();
		System.out.println(n+" TABLE");
		for(i=1;i<=n1;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
