package com.tys.assessment;
import java.util.*;

public class GetById {
	public void id(ArrayList<Student> li)
	{
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("enter the id whose info u have to see");
	int choice = sc.nextInt();
	for (i = 0; i < li.size(); i++) {
		if (li.get(i).getId() == choice) {
			System.out.println(li.get(i));
			break;
		}
	}
	if (i == li.size())
		System.out.println("id not found");
	}

}
