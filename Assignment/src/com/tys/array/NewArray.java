package com.tys.array;

public class NewArray {
	void newarr(int arr[])
	{
		int i;
		int arr1[];
		if(arr.length<2)
		{
			arr1=new int[1];
			arr1[0]=arr[0];
		}
		else
		{
			arr1=new int[2];
			for(i=0;i<2;i++)
				arr1[i]=arr[i];
		}
		System.out.println("The new array:");
		for(i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	}

}
