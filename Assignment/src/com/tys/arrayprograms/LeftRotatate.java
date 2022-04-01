package com.tys.arrayprograms;

import java.util.Scanner;
//left rotate by 2
//fa1,2,3,4,5=3,4,5,1,2

public class LeftRotatate {
	public static int[] leftrotate(int arr[])
	{
		int i,j,temp;
		for(i=0;i<2;i++)
		{
			temp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements in the array");
		n=sc.nextInt();
		arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		arr=leftrotate(arr);
		for(i=0;i<n;i++)
		 System.out.println(arr[i]);

	}

}