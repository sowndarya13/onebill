package com.tys.arrayprograms;
import java.util.*;

public class LargeInt {
	public  int large(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static void main()
	{
	int arr[],n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of elements in the array");
	n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
	LargeInt l=new LargeInt();
	System.out.println("the largest element in the array is "+l.large(arr));
	}

}
