package com.tys.arrayprograms;
import java.util.*;

public class Frequency {
	public static void main(String args[])
	{
	int arr[],n,i,count,k,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of elements in the array");
	n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(i=0;i<n;i++)
	{
		count=1;
		for(k=i-1;k>=0;k--)
		{
			if(arr[i]==arr[k])
			{
			      count=0;
			      break;
			}
		}
		if(count==0)
			continue;
		for(j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		System.out.println("the frequency of the element "+arr[i]+" is "+count);
	}
	
	}	

}
