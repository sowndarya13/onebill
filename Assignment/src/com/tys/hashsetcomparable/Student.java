package com.tys.hashsetcomparable;

import java.util.*;

public class Student implements Comparable<Student> {
	String name;
	int id;
	String dept;
	long mobileno;
	public Student(String name, int id, String dept, long mobileno) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + ", mobileno=" + mobileno + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	//@Override
	//public boolean equals(Object obj) {
		//Student std=(Student)obj;
		//return this.id==std.id;
	//}
	public boolean equals(Object obj)

	{
		Student std=(Student)obj;
		 return this.name.equals(std.name);
	}//this is to compare by name if same name,it indicates duplicate.
	@Override
	public int compareTo(Student s) {
		return this.id-s.id;
	}
	
	
	

}
