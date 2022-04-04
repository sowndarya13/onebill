package com.tys.numbersystem;
import java.util.*;

public class Armstrong {
	public static void armstrong(int n)
	{
		int res=0,num=n,i;
		for(i=0;num!=0;i++,num/=10);
		num=n;
		while(num!=0)
		{
			res+=(int)Math.pow(num%10,i);
			num/=10;
		}
		if(res==n)
			System.out.println("armstrong");
		else
			System.out.println("NOT A ARMSTRONG");
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		armstrong(n);
		

	}

}
