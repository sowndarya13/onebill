package com.tys.exceptions;
import java.util.*;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		int res,n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		res=n1/n2;
		int arr[]=new int[res];
		System.out.println(arr[4]);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
