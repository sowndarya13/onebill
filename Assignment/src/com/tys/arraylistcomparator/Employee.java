package com.tys.arraylistcomparator;

public class Employee{
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
	public String toString() {
		return "Employee [id=" + id + ", designation=" + designation + ", name=" + name + ", salary=" + salary + "]";
	}

}
