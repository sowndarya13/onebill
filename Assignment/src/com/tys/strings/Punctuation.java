package com.tys.strings;
import java.util.*;

public class Punctuation {
	public static int punctuation(String str)
	{
		int i,count=0;
		for(i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='!'||str.charAt(i)=='?'||str.charAt(i)==';'||
				str.charAt(i)==':'||str.charAt(i)=='-'||str.charAt(i)=='!'||str.charAt(i)=='"'||str.charAt(i)=='\'')
		count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		String str;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	    System.out.println("the no. of punctuation in the string :"+punctuation(str));
	     
	}

}
