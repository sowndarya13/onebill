package com.tys.strings;

import java.util.Scanner;

public class NumConsonants {
	public static int consonants(String str)
	{
		int i,count=0;
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)>=97&&str.charAt(i)<=122)) 
			{
				if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u'|| str.charAt(i) == 'A'|| str.charAt(i) == 'E'|| str.charAt(i) == 'I'
					|| str.charAt(i) == 'O'|| str.charAt(i) == 'U')) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		String str;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	    System.out.println("the no. of consonants in the string :"+consonants(str));
		
	}

}
