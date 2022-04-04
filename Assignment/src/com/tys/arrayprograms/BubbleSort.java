package com.tys.arrayprograms;

import java.util.*;
//descending order

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_size, i, j;
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO. OF ELEMENTS IN THE ARRAY:");
		arr_size=sc.nextInt();
		arr=new int[arr_size];
		System.out.println("enter the array elements:");
		for(i=0;i<arr_size;i++)
			arr[i]=sc.nextInt();
		for (i = 0; i < arr_size-1; i++) {
			for (j = 0; j < arr_size - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < arr_size; i++) {
			System.out.println(arr[i]);
		}

	}

}
