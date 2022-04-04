package com.tys.assessment;

import java.util.*;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, choice, id;
		String name, course, choice1;
		float marks, choice2;
		ArrayList<Student> li = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("CHOICE LIST:");
			System.out.println("1.Add student\n2.Edit student\n3.Delete student\n4.Show list of students\n5.Get"
					+ " student by id\n6.Sort the list of student\n7.exit");
			System.out.println("enter ur choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student stud1 = new Student();
				li.add(stud1);
				System.out.println("enter the ID,Name,Mark and Course of the student");
				id = sc.nextInt();
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				stud1.add(id, name, marks, course);
				break;
			case 2:
				System.out.println("edit by:");
				System.out.println("1.Id\n2.Index\n3.Course\n4.name\n5.marks");
				System.out.println("enter ur choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("enter the id");
					choice = sc.nextInt();
					for (i = 0; i < li.size(); i++) {
						if (li.get(i).getId() == choice) {
							System.out.println("enter the ID,Name,Mark and Course of the student for editing");
							id = sc.nextInt();
							name = sc.next();
							marks = sc.nextFloat();
							course = sc.next();
							li.get(i).setId(id);
							li.get(i).setName(name);
							li.get(i).setMarks(marks);
							li.get(i).setCourse(course);
							break;
						}
					}
					if (i == li.size()) {
						System.out.println("entered id is not in the arraylist");
					}
					break;
				case 2:
					System.out.println("enter the index");
					choice = sc.nextInt();

					if (choice >= li.size()) {
						System.out.println("index is not valid");
						break;
					}
					System.out.println("enter the ID,Name,Mark and Course of the student for editing");
					id = sc.nextInt();
					name = sc.next();
					marks = sc.nextFloat();
					course = sc.next();
					li.get(choice).setId(id);
					li.get(choice).setName(name);
					li.get(choice).setMarks(marks);
					li.get(choice).setCourse(course);
					break;
				case 3:
					System.out.println("enter the course");
					choice1 = sc.next();
					choice = 0;
					for (i = 0; i < li.size(); i++) {
						if (li.get(i).getCourse().equals(choice1)) {
							System.out.println("enter the ID,Name,Mark and Course of the student for editing");
							id = sc.nextInt();
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
						System.out.println("entered course is not in the arraylist");
					}
					break;
				case 4:
					System.out.println("enter the name");
					choice1 = sc.next();
					choice = 0;
					for (i = 0; i < li.size(); i++) {
						if (li.get(i).getName().equals(choice1)) {
							System.out.println("enter the ID,Name,Mark and Course of the student for editing");
							id = sc.nextInt();
							name = sc.next();
							marks = sc.nextFloat();
							course = sc.next();
							li.get(i).setId(id);
							li.get(i).setName(name);
							li.get(i).setMarks(marks);
							li.get(i).setCourse(course);
						}
					}
					if (choice == 0) {
						System.out.println("entered name is not in the arraylist");
					}
					break;
				case 5:
					System.out.println("enter the marks");
					choice2 = sc.nextFloat();
					choice = 0;
					for (i = 0; i < li.size(); i++) {
						if (li.get(i).getMarks() == choice2) {
							System.out.println("enter the ID,Name,Mark and Course of the student for editing");
							id = sc.nextInt();
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
					break;
				default:
					System.out.println("not valid choice");
				}
				break;

			case 3:
				System.out.println("Tell which id u want to delete:");
				while (true) {
					choice = sc.nextInt();
					for (i = 0; i < li.size(); i++) {
						if (li.get(i).getId() == choice) {
							li.remove(i);
							break;
						}
					}
					if (i == li.size()) {
						System.out.println("enter the valid id:");
						continue;
					}
					break;
				}

				break;
			case 4:
				System.out.println(li);
				break;
			case 5:
				System.out.println("enter the id whose info u have to see");
				choice = sc.nextInt();
				for (i = 0; i < li.size(); i++) {
					if (li.get(i).getId() == choice) {
						System.out.println(li.get(i));
						break;
					}
				}
				if (i == li.size())
					System.out.println("id not found");
				break;
			case 6:
				System.out.println("choice list:");
				System.out.println("1.sortbyname\n2.sortbyid\n3.sortbycourse\n4.sortbymarks");
				System.out.println("Enter ur choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					Collections.sort(li, new SortByName());
					break;
				case 2:
					Collections.sort(li, new SortById());
					break;
				case 3:
					Collections.sort(li, new SortByCourse());
					break;
				case 4:
					Collections.sort(li, new SortByMarks());
					break;
				default:
					System.out.println("invalid choice");
				}
				break;
			case 7:
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choicve entry.enter the correct choice from the list");
				continue;
			}
		}
	}

}
