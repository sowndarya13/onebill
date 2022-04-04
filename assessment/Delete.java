package com.tys.assessment;

import java.util.*;

public class Delete {
	Scanner sc = new Scanner(System.in);

	public void deleting(ArrayList<Student> li) {
		int i;
		System.out.println("Tell which id u want to delete:");
		while (true) {
			int choice = sc.nextInt();
			for (i = 0; i < li.size(); i++) {
				if (li.get(i).getId() == choice) {
					li.remove(i);
					return;
				}
			}
			if (i == li.size()) {
				System.out.println("enter the valid id:");
				continue;
			}
			break;
		}
	}

}
