package com.tys.strings;

import java.util.Scanner;

public class DivideString {
	public static void divide(String str,int n)
	{
		String str1[];
		int i,j=0,k=0;
		if(str.length()%n!=0)
		{
			System.out.println("can't divide equally");
			return ;
		}
		str1=new String[str.length()/n];
		char arr[]=new char[n];
		for(i=0;i<str1.length;i++)
		{
			j=0;
			while(j<n)
			{
			  arr[j]=str.charAt(k);
			  j++;
			  k++;
			}
			str1[i]=String.valueOf(arr);
		}
		for(i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str;
		 int n;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     System.out.println("enter the n value:");
	     n=sc.nextInt();
	     divide(str,n);

	}

}
