package com.tys.assessment;

import java.util.*;

public class Edit {
	Scanner sc = new Scanner(System.in);
	int i, choice, id, j;
	String name, course,choice1;
	float marks,choice2;

	public void byid(ArrayList<Student> li) {
		System.out.println("enter the id");
		choice = sc.nextInt();
		for (i = 0; i < li.size(); i++) {
			if (li.get(i).getId() == choice) {
				System.out.println("enter the id,Name,Mark and Course of the student for editing");
				id = sc.nextInt();
				for (j = 0; j < li.size(); j++) {
					if (li.get(j).getId() == id) {
						System.out.println("DUPLICATE ID NOT POSSIBLE.so not edited");
						return;
					}
				}
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				li.get(i).setId(id);
				li.get(i).setName(name);
				li.get(i).setMarks(marks);
				li.get(i).setCourse(course);
				return;
			}
		}
			System.out.println("entered id is not in the arraylist");
		}
	public void byindex(ArrayList<Student> li)
	{
		System.out.println("enter the index");
		choice = sc.nextInt();

		if (choice >= li.size()) {
			System.out.println("index is not valid");
			return;
		}
		System.out.println("enter the ID,Name,Mark and Course of the student for editing");
		id = sc.nextInt();
		for (j = 0; j < li.size(); j++) {
			if (li.get(j).getId() == id) {
				System.out.println("DUPLICATE ID NOT POSSIBLE.so not edited");
				return;
			}
		}
		name = sc.next();
		marks = sc.nextFloat();
		course = sc.next();
		li.get(choice).setId(id);
		li.get(choice).setName(name);
		li.get(choice).setMarks(marks);
		li.get(choice).setCourse(course);
	}
	public void bycourse(ArrayList<Student> li)
	{
		System.out.println("enter the course");
		choice1 = sc.next();
		choice = 0;
		for (i = 0; i < li.size(); i++) {
			if (li.get(i).getCourse().equals(choice1)) {
				System.out.println("enter the ID,Name,Mark and Course of the student for editing");
				id = sc.nextInt();
				for (j = 0; j < li.size(); j++) {
					if (li.get(j).getId() == id) {
						System.out.println("DUPLICATE ID NOT POSSIBLE.so not edited");
						return;
					}
				}
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				li.get(i).setId(id);
				li.get(i).setName(name);
				li.get(i).setMarks(marks);
				li.get(i).setCourse(course);
				choice=1;
			}
		}
		if(choice==0)
			System.out.println("entered course is not in the arraylist");
		}
	public void byname(ArrayList<Student> li)
	{
		System.out.println("enter the name");
		choice1 = sc.next();
		choice = 0;
		for (i = 0; i < li.size(); i++) {
			if (li.get(i).getName().equals(choice1)) {
				System.out.println("enter the ID,Name,Mark and Course of the student for editing");
				id = sc.nextInt();
				for (j = 0; j < li.size(); j++) {
					if (li.get(j).getId() == id) {
						System.out.println("DUPLICATE ID NOT POSSIBLE.so not edited");
						return;
					}
				}
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				li.get(i).setId(id);
				li.get(i).setName(name);
				li.get(i).setMarks(marks);
				li.get(i).setCourse(course);
				choice=1;
			}
		}
		if (choice == 0) {
			System.out.println("entered name is not in the arraylist");
		}
	}
	public void bymarks(ArrayList<Student> li)
	{
		System.out.println("enter the marks");
		choice2 = sc.nextFloat();
		choice = 0;
		for (i = 0; i < li.size(); i++) {
			if (li.get(i).getMarks() == choice2) {
				System.out.println("enter the ID,Name,Mark and Course of the student for editing");
				id = sc.nextInt();
				for (j = 0; j < li.size(); j++) {
					if (li.get(j).getId() == id) {
						System.out.println("DUPLICATE ID NOT POSSIBLE.so not edited");
						return;
					}
				}
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				li.get(i).setId(id);
				li.get(i).setName(name);
				li.get(i).setMarks(marks);
				li.get(i).setCourse(course);
				choice = 1;
			}
		}
		if (choice == 0) {
			System.out.println("entered marks is not in the arraylist");
		}
	}
	
	}
