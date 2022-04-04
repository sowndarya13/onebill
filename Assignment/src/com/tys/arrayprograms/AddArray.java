package com.tys.arrayprograms;
import java.util.*;

public class AddArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr_size,arr[],i,sum=0;
		System.out.println("enter the no. of elements in the array");
		arr_size=sc.nextInt();
		arr=new int[arr_size];
		for(i=0;i<arr_size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of the numbers in the array is"+sum);
	}


}
