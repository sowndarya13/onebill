package com.tys.array;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,a=-1,b=1,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of numbers to be printed in the series:");
		n=sc.nextInt();
		System.out.println("Fibonacci series");
		for(i=0;i<n;i++)
		{
			temp=a;
			a=b;
			b=temp+a;
			System.out.println(b);
		}
	}

}
