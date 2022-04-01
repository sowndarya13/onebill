package com.tys.arrayprograms;
//right rotate by 2
//1,2,3,4,5->4,5,1,2,3
import java.util.Scanner;

public class RightRotate {
		public static int[] rightrotate(int arr[])
		{
			int i,j,temp;
			for(i=0;i<2;i++)
			{
				temp=arr[arr.length-1];
				for(j=arr.length-1;j>0;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[j]=temp;
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
			arr=rightrotate(arr);
			for(i=0;i<n;i++)
			 System.out.println(arr[i]);

		}

}
