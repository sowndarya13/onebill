package com.tys.numbersystem;
// to find large among 5 nuumbers

import java.util.Scanner;

public class Large {
	public static int large(int[] arr)
	{
		int i,max=arr[0];
		for(i=0;i<5;i++)
		{
			if(max<arr[i])
                 max=arr[i];
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 5 NUMBERS:");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		System.out.println("the largest of 5 numbers is "+large(arr));

	}

}
