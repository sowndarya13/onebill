package com.tys.heirarchical;

public class Member {
	String Name,Address;
	int Age,Salary;
	long Phone_Number;
	public Member()
	{
		
	}
	public Member(String name, String address, int age, int salary, long phone_Number) {
		Name = name;
		Address = address;
		Age = age;
		Salary = salary;
		Phone_Number = phone_Number;
	}
   public void printSalary()
   {
	   System.out.println("Salary:"+Salary);
   }
}
