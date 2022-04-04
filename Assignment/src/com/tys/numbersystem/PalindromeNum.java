package com.tys.numbersystem;
import java.util.*;

public class PalindromeNum {
	public static void palindrome(int num)
	{
		int n=num,res=0;
		 while(n!=0)
		 {
			res=res*10+(n%10);
			n/=10;
		 }
		 if(res==num)
			 System.out.println("palindrome");
		 else
			 System.out.println("not a palindrome");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		palindrome(n);
		

	}

}
