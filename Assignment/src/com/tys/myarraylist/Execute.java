package com.tys.myarraylist;

import java.util.*;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList li = new MyArrayList();
		li.add(39);
		li.add(10);
		li.add(30);
		li.add(30);
		System.out.println("----------");
		System.out.println(li.get(2));
		System.out.println("-----------");
		li.display();
		System.out.println("-----------");
		li.add(31);
		li.display();
		System.out.println("-----------");
		li.add(67);
		li.display();
		System.out.println("-----------");
		li.remove(null);
		li.display();
		System.out.println("-----------");
		li.remove(null);
		li.display();
		System.out.println("-----------");
		li.remove(null);
		li.display();
		System.out.println("-----------");
		li.remove(null);
		li.display();
		
		System.out.println("-----------");
		li.remove(null);
		li.display();
		System.out.println("-----------");
		li.add(10);
		li.display();
		
		
		
	}

}
