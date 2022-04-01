package com.tys.treeset;

import java.util.*;

public class Employee implements Comparable<Employee> {
	String name;
	int id;

	public Employee(int id,String name) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		return emp.name.equals(this.name);
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	

}