package com.tys.collection;

public class Employee implements Comparable<Employee> {
	int id;
	String designation, name;
	double salary;

	public Employee(int id, String designation, String name, double salary) {
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", designation=" + designation + ", name=" + name + ", salary=" + salary + "]";
	}

}
