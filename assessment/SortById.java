package com.tys.assessment;

import java.util.*;

public class SortById implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getId() - o2.getId();
	}

}
