package com.tys.assessment;

import java.util.*;

public class Add {
	Scanner sc=new Scanner(System.in);
	public void Adding(ArrayList<Student> li)
	{
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	Student stud1 = new Student();
	System.out.println("enter the ID,Name,Mark and Course of the student");
	int id = sc.nextInt();
	for (int i = 0; i < li.size(); i++) {
		if (li.get(i).getId() == id) {
			System.out.println("DUPLICATE ID NOT POSSIBLE.so object not added");
			choice = 1;
		}
	}
	if (choice == 1)
		return;
	String name = sc.next();
	float marks = sc.nextFloat();
	String course = sc.next();
	stud1.add(id, name, marks, course);
	li.add(stud1);
	}
}
