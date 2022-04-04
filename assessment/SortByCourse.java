package com.tys.assessment;

import java.util.Comparator;

public class SortByCourse implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCourse().compareTo(o2.getCourse());
	}
	
	 

}
