package com.tys.collection;
import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);
		List li=new ArrayList();
		li.add(100);
		li.add(200);
		System.out.println(li);
		list.addAll(li);
		System.out.println(list);
		System.out.println(li);
		list.removeAll(li);
		System.out.println(list);
		System.out.println(li);
		System.out.println(list.get(2));
		Collections.sort(list);
		System.out.println(li);
	}

}
