package com.tys.strings;

import java.util.Scanner;
// to get character use the below method in main()

public class ReplaceSpace {
	public static String replace(String str,char a)
	{
		int i;
		char arr[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(arr[i]==' ')
				arr[i]=a;
		}
		str=String.valueOf(arr);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char a;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     System.out.println("ENTER THE CHAR WITH WHICH U WANT TO REPLACE SPACE IN THE STRING:");
	     a=sc.next().charAt(0);
	    System.out.println("the new string is "+replace(str,a));

	}

}
