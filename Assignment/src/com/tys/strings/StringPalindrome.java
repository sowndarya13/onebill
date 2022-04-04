package com.tys.strings;
import java.util.*;
public class StringPalindrome {
     
	public static void palindrome(String arr)
	{
		int i,j=arr.length()-1,temp=0;
		for(i=0;i<arr.length();i++)
		{
				if(arr.charAt(i)!=arr.charAt(j))
				{
					temp=1;
					break;
				}
				j--;
		}
		if(temp==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String[] args)
	{
		String str;
	     System.out.println("enter the string to check for palindrome");
	     Scanner sc=new Scanner(System.in);
	     str=sc.next();
	     palindrome(str);
	     
	}
}
