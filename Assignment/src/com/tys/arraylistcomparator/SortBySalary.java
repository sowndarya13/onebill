package com.tys.arraylistcomparator;
import java.util.*;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)o1.salary-(int)o2.salary;
	}
	

}
