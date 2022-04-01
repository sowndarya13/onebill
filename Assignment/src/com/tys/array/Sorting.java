package com.tys.array;
//descending bubble sort
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_size=5,i,j,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements in array");
		arr_size=sc.nextInt();
		arr=new int[arr_size];
		for(i=0;i<arr_size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr_size;i++)
		{
			for(j=0;j<arr_size-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<arr_size;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
