package com.tys.matrix;
import java.util.*;
//add matrix

public class AddMatrix {
	
	public static int[][] add(int a[][],int b[][],int col)
	{
		int i,j,arr[][]=new int[a.length][col];
	    for(i=0;i<a.length;i++)
	    {
	    	for(j=0;j<col;j++)
	    	{
	    		arr[i][j]=a[i][j]+b[i][j];
	    	}
	    }
	    return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],b[][],row,col,i,j;
		System.out.println("enter the no. of rows and columns in matrix");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		b=new int[row][col];
		System.out.println("ENTER THE 1ST MATRIX:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("enter the 2nd matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				b[i][j]=sc.nextInt();
		}
		
	    a=add(a,b,col);
	    System.out.println("the sum of the matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
