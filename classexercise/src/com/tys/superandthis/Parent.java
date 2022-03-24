package com.tys.superandthis;

public class Parent {
	int x,y;
	Parent()
	{
		System.out.println("parent cons");
	}
	Parent(int x,int y)
	{
	 this.x=x;//if this not given there arrives ambiguity in this case
	 this.y=y;
	 System.out.println("parent cons with 2 parameter");
	}

}
