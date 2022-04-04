package com.tys.strings;
import java.util.*;

public class NumVowels {
	public static int vowels(String str) {
		int i, count = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u'|| str.charAt(i) == 'A'|| str.charAt(i) == 'E'|| str.charAt(i) == 'I'
					|| str.charAt(i) == 'O'|| str.charAt(i) == 'U')
				count++;
		}
		return count;
	}
	public static void main(String args[])
	{
		String str;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	    System.out.println("the no. of vowels in the string :"+vowels(str));
		
	}

}
