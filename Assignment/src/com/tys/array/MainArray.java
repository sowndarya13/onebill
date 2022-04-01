package com.tys.array;
import java.util.*;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,arr_size,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arra size");
		arr_size=sc.nextInt();
		arr=new int[arr_size];
		System.out.println("Enter the array elements");
		for(i=0;i<arr_size;i++)
			arr[i]=sc.nextInt();
		NewArray n=new NewArray();
		n.newarr(arr);
}

}
