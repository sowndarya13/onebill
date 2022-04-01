package com.tys.linkedlist;
import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<>();
		ArrayList<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(null);
		li.add(10);
		li.add(5);
		li.add(2,null);//if the size of linked list is 2,next while inserting using index the index can be either 0 ,1 or 2
		//otherwise out of bolund error occurs
		System.out.println(li);
		li.addAll(l);
		li.remove(1);
		System.out.println(li);
		li.removeAll(l);
		System.out.println(li);
		
	}

}
