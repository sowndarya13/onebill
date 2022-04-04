package com.tys.arrayprograms;
import java.util.*;

public class PrintDuplicates {
	public static void duplicates(int arr[])
	{
		int i,j,temp,present=0;
		System.out.println("duplicacy in array:");
		for(i=0;i<arr.length-1;i++)
		{
			temp=0;
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]==arr[i])
				{
					temp=1;
					present=1;
					break;
				}
			}
			if(temp==1)
				continue;
				
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		if(present==0)
			System.out.println("no such duplicacy");
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
		duplicates(arr);


	}
}
