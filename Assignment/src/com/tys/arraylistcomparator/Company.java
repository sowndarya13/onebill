package com.tys.arraylistcomparator;

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
		System.out.println("arraylist before sorting:");
		System.out.println(a);
		int choice=0;
		System.out.println("choose ur sorting method:\n1.sort by id\n2.sort by name\n3.sort by salary");
		System.out.println("Enter ur choice:");
		Scanner s=new Scanner(System.in);
		while(true)
		{
		choice=s.nextInt();
		if(choice<=3&&choice>0)
			break;
		else
			System.out.println("give correct choice");
		}
		System.out.println("after sorting");
		switch(choice)
		{
		case 1:SortById sortbyid = new SortById();
	           Collections.sort(a,sortbyid);
	           break;
		case 2:SortByName sortbyname = new SortByName();
		       Collections.sort(a,sortbyname);
		       break;
		case 3:SortBySalary sortbysalary = new SortBySalary();
	           Collections.sort(a,sortbysalary);
	           break;
		}
		Iterator<Employee> iterators = a.iterator();
		while (iterators.hasNext()) {
			System.out.println(iterators.next());
		} // after this the pointer 'll be at last

	}

}
