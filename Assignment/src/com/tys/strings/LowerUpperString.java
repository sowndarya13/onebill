package com.tys.strings;

import java.util.Scanner;

public class LowerUpperString {
	public static String replace(String str)
	{
		int i=0;
		char arr[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90) 
               arr[i]+=32;   				
			else if(str.charAt(i)>=97&&str.charAt(i)<=122)
				arr[i]-=32;

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
	     System.out.println("The new string is "+replace(str));
	}

}
