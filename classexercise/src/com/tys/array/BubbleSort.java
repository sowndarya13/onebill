//descending bubble sort
package com.tys.array;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_size=5,i,j;
		int arr[]= {23,56,5,2,20};
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
