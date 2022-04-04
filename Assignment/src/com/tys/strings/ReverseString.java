package com.tys.strings;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str)
	{
		int i,j=str.length()-1;
		char arr[]=str.toCharArray(),temp;
	       for(i=0;i<=j;i++)
	       {
	    	   temp=arr[i];
	    	   arr[i]=arr[j];
	    	   arr[j]=temp;
	    	   j--;
	       }
	      str=String.valueOf(arr);
	      return str;
	}

	public static void main(String[] args)
	{
		String str;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     System.out.println("The new reversed string is "+reverse(str));
	}

}
