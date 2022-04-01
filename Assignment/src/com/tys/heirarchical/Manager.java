
package com.tys.heirarchical;

public class Manager extends Member {
	String department;

	

	public Manager(String name, String address, int age, int salary, long phone_Number,String department) {
		super(name, address, age, salary, phone_Number);
		this.department=department;
	}
	

}
