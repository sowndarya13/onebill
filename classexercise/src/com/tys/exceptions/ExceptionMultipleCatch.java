package com.tys.exceptions;

import java.util.Scanner;

public class ExceptionMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			int res,n1,n2;
			n1=sc.nextInt();
			n2=sc.nextInt();
			res=n1/n2;
			int arr[]=new int[res];
			System.out.println(arr[4]);
			}catch(ArithmeticException e)
		    {
				System.out.println("divide4 by 0");
		    }
		     catch(ArrayIndexOutOfBoundsException e)
		   {
		    	 System.out.println("out of bound");
		   }
	
      /*catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
      if(e instanceof ArithmeticException )
      {
      System.out.println("divide4 by 0");
      }
      if(e instanceof ArrayIndexOutOfBoundsException)
      {
        System.out.println("out of bound");
      }
     }*/

	}

}
