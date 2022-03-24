package com.tys.encapsulation;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setAge(20);
		e.setDesignation("trainee");
		e.setSalary(30000);
		e.setName("SOW");
		System.out.println(e.getAge());
		System.out.println(e.getDesignation());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
