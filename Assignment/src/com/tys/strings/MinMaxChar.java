package com.tys.strings;

public class MinMaxChar {
	public static void min(String str)
	{
		int i,j,count=0;
		for(i=0;i<str.length();i++)
		{
		   for(j=i+1;j<str.length();j++)
		   {
			  if(str.charAt(i)==str.charAt(j)) 
			  {
				 count++; 
			  }
		   }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
