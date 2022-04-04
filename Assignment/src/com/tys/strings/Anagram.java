package com.tys.strings;
//if two strings have same no. of characters irrespective of the order-anagram
import java.util.*;

public class Anagram {
	
	public static void anagram(String str1,String str2)
	{
		int i,j;
		char temp;
		char arr[]=str1.toCharArray(),arr1[]=str2.toCharArray();
		if(arr.length==arr1.length)
		{
			for(i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)>=65&&str1.charAt(i)<=90) 
	               arr[i]+=32;   
				if(str2.charAt(i)>=65&&str2.charAt(i)<=90) 
		               arr1[i]+=32;   

			}
			for(i=0;i<arr.length-1;i++)
			{
				for(j=0;j<arr.length-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					if(arr1[j]>arr1[j+1])
					{
						temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;
					}
				}
			}
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr1[i])
                {
                     System.out.println("not a anagram");
                     return;
                }

			}
			System.out.println("anagram");
			
			
		}
		else
		{
			System.out.println("not a anagram");
		}
	}
	public static void main(String[] args)
	{
		String str,str1;
	     System.out.println("enter the two string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     str1=sc.nextLine();
	     anagram(str,str1);
	}

}
