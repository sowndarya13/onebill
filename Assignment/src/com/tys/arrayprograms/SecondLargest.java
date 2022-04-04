package com.tys.arrayprograms;
//to find second largest in array without sorting

import java.util.Scanner;

public class SecondLargest {
    public static int second(int[] arr)
    {
    	int count[],max=arr[0],i,temp=0;
    	for(i=0;i<arr.length;i++)
    	{
    	  if(max<arr[i])
    		  max=arr[i];
    	}
    	count=new int[max+1];
    	for(i=0;i<arr.length;i++)
    	{
    		++count[arr[i]];
    	}
    	for(i=count.length-1;i>=0;i--)
    	{
    		if(count[i]!=0)
    			temp++;
    		if(temp==2)
    		    break;
    	}
    	return i;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements in the array");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("the second largest element is "+second(arr));
		

	}

}
