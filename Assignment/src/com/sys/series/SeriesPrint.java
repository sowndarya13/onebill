package com.sys.series;
import java.util.Scanner;
import java.lang.Math.*;
public class SeriesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(a+(2^0)*b),(a+(2^0)*b+(2^1)*b),........
		int i,a,b,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("enter the no. upto which the series has be printed:");
		n=s.nextInt();
		System.out.println("The series:");
		for(i=0;i<n;i++)
		{
				a+=(int)Math.pow(2,i)*b;
				System.out.print(a+" ");
		}
	}

}
