package com.tys.myarraylist;

import java.util.Arrays;

public class MyArrayList{
	int size=10,position,j=0,i;
	private Object[] array;
	MyArrayList()
	{
		array=new Object[size];
	}
	MyArrayList(int size)
	{
		this.size=size;
		array=new Object[size];
		
	}
	public void add(Object e)
	{
		if(position>=size)
			initialCapacity();
		array[position++]=e;
	}
	public void remove(Object e)
	{
		if(position<0)
			System.out.println("empty arraylist .can't delete");
		else
		{
			for(i=0;i<array.length;i++)
			{
				if(e==array[i])
				{
					j=1;
					break;
				}
			}
			if(j==1)
			{
				if(i<position)
					position=position-1;
				for(;i<array.length-1;i++)
					array[i]=array[i+1];
			    finalCapacity();
			    
			}
			else
				System.out.println("element to be removed is not in arraylist");
		}
	}
	private void finalCapacity()
	{
		Object[] temp;
		this.size=size-1;
		temp=new Object[size];
		for(int i=0;i<size;i++)
			temp[i]=array[i];
		array=temp;
		
	}
	private void initialCapacity()
	{
		Object[] temp;
		this.size=(size*3)/2+1;
		temp=new Object[size];
		for(int i=0;i<array.length;i++)
			temp[i]=array[i];
		array=temp;
	}
	Object get(int index)
	{
		return array[index];
	}
	
	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}
	public void display()
	{
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
		System.out.println("array size"+array.length);
		System.out.println("array position"+position);
	}
	

}
