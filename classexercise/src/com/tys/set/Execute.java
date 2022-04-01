package com.tys.set;
import java.util.*;
//hashset code

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashset=new HashSet<>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);
		hashset.add(10);//this method returns false so 10 don"t get addaed to the set
		Iterator iterator=hashset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
