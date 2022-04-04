package com.tys.assessment;

import java.util.*;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
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
				Add a = new Add();
				a.Adding(li);
				break;
			case 2:
				Edit edit = new Edit();
				System.out.println("edit by:");
				System.out.println("1.Id\n2.Index\n3.Course\n4.name\n5.marks");
				System.out.println("enter ur choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					edit.byid(li);
					break;
				case 2:
					edit.byindex(li);
					break;
				case 3:
					edit.bycourse(li);

					break;
				case 4:
					edit.byname(li);
					break;
				case 5:
					edit.bymarks(li);
					break;
				default:
					System.out.println("not valid choice");
				}
				break;

			case 3:
				Delete del = new Delete();
				del.deleting(li);
				break;
			case 4:
				System.out.println(li);
				break;
			case 5:
				GetById ref = new GetById();
				ref.id(li);
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
