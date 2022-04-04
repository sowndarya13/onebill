package com.tys.matrix;

import java.util.Scanner;

public class TransposeMatrix {
	public static int[][] transpose(int a[][],int col)
	{
		int i,j,arr[][]=new int[col][a.length];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[j][i]=a[i][j];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],row,col,i,j;
		System.out.println("enter the no. of rows and columns in matrix");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		System.out.println("ENTER THE MATRIX:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		}
	    a=transpose(a,col);
	    System.out.println("the transpose of the matrix");
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

	}
