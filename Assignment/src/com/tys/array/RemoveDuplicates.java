package com.tys.array;
import java.util.*;

public class RemoveDuplicates {
	public static int[] duplicates(int arr[])
	{
		int i,j,temp,temp1[];
		System.out.println("duplicacy in array:");
		for(i=0;i<arr.length-1;i++)
		{
			temp=0;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					temp=1;
					break;
				}
			}
			if(temp==0)
			{
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]==arr[i])
				{
					temp=1;
					j=i;
					break;
				}
			}
			}
			if(temp==1)
			{
			temp1=new int[arr.length-1];
			for(;j<arr.length-1;j++)
				arr[j]=arr[j+1];
			for(j=0;j<temp1.length;j++)
				temp1[j]=arr[j];
			arr=temp1;
		    }
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
		arr=duplicates(arr);
		System.out.println("after removing duplicacy");
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);


	}

}
