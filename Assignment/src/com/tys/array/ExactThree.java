package com.tys.array;

import java.util.*;

public class ExactThree {
	boolean ans(int arr[]) {
		int count = 0,i=0;
		while(i<arr.length)
		 {
			if (arr[i]==3) {
				if ((i+1<arr.length&&arr[i + 1] == 3)||count>3)
					return false;
				count++;
			 i+=2;
			}
			else
				i++;
		}
		if(count!=3)
			return false;
		return true;
	}

	public static void main(String[] args) {
		int arr[], size;
		System.out.println("enter the no. of elements in the array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		ExactThree e = new ExactThree();
		System.out.println(e.ans(arr));

	}

}
