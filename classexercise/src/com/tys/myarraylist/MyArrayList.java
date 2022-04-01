package com.tys.myarraylist;

public class MyArrayList{
	int size=10,position;
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
	public void display()
	{
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
	}
	

}
