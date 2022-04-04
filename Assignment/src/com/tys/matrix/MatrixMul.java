package com.tys.matrix;

import java.util.Scanner;

public class MatrixMul {
	public static int[][] mul(int a[][], int b[][], int r1, int r2, int c) {
		int mul[][] = new int[r1][c], i, j, k;
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c; j++) {
				for (k = 0; k < r2; k++) {
					mul[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		return mul;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][], b[][], row1, col1, row2, col2, i, j;
		System.out.println("enter the no. of rows and columns in matrix1");
		Scanner sc = new Scanner(System.in);
		row1 = sc.nextInt();
		col1 = sc.nextInt();
		System.out.println("enter the no. of rows and columns in matrix2");
		row2 = sc.nextInt();
		col2 = sc.nextInt();
		if (col1 != row2)
			System.out.println("matrix mul not possible as the two matrix row and column not same respestively");

		else {
			a = new int[row1][col1];
			b = new int[row2][col2];
			System.out.println("ENTER THE 1ST MATRIX:");
			for (i = 0; i < row1; i++) {
				for (j = 0; j < col1; j++)
					a[i][j] = sc.nextInt();
			}
			System.out.println("enter the 2nd matrix:");
			for (i = 0; i < row2; i++) {
				for (j = 0; j < col2; j++)
					b[i][j] = sc.nextInt();
			}

			a = mul(a, b, row1, row2, col2);
			System.out.println("the sum of the matrix:");
			for (i = 0; i < row1; i++) {
				for (j = 0; j < col2; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
