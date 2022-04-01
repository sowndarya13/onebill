package com.tys.arraylistcomparable;

import java.util.*;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1, "trainee", "susi", 30000);
		Employee e1 = new Employee(2, "trainee", "shashi", 30000);
		Employee e2 = new Employee(3, "trainee", "sow", 30000);
		Employee e3 = new Employee(4, "trainee", "deeps", 30000);
		Employee e4 = new Employee(5, "trainee", "asha", 30000);
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(e);
		a.add(e2);
		a.add(e3);
		a.add(e1);
		a.add(e4);
		System.out.println("display using for loop");
		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));
		System.out.println("-------------");
		System.out.println("display using for each");
		for (Employee e5 : a)
			System.out.println(e5);
		System.out.println("-------");
		Collections.sort(a);// always manipulate before iterator object
		System.out.println("display using iterator");
		Iterator<Employee> iterators = a.iterator();
		while (iterators.hasNext()) {
			System.out.println(iterators.next());
		} // after this the pointer 'll be at last

	}

}
