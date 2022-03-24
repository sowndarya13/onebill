package com.tys.heirarchical;

public class Employee extends Member {
	String specialization;

	public Employee(String name, String address, int age, int salary, long phone_Number, String specialization) {
		super(name, address, age, salary, phone_Number);
		this.specialization = specialization;
	}
}
