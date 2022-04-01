package com.tys.collection;

import java.util.*;

public class SortById implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}

}
