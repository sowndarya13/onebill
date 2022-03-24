<<<<<<< HEAD
package com.tys.heirarchical;

public class Main {

	public static void main(String[] args) {
		Manager m=new Manager("sowndarya","16/14,natarajan east street",21,30000,8825583593l,"resource");
		System.out.println("Manager:");
		System.out.println("NAME:"+m.Name);
		System.out.println("ADDRESS"+m.Address);
		System.out.println("AGE:"+m.Age);
		m.printSalary();
		System.out.println("PHONE NUMBER:"+m.Phone_Number);
		System.out.println("DEPARTMENT:"+m.department);
		System.out.println();
		System.out.println("employee:");
		Employee e=new Employee("shalini","coimbatore",22,35000,8940500895l,"computerscience");
		System.out.println("NAME:"+e.Name);
		System.out.println("ADDRESS"+e.Address);
		System.out.println("AGE:"+e.Age);
		e.printSalary();
		System.out.println("PHONE NUMBER:"+e.Phone_Number);
		System.out.println("DEPARTMENT:"+e.specialization);
		

	}

}
=======
package com.tys.heirarchical;

public class Main {

	public static void main(String[] args) {
		Manager m=new Manager("sowndarya","16/14,natarajan east street",21,30000,8825583593l,"resource");
		System.out.println("Manager:");
		System.out.println("NAME:"+m.Name);
		System.out.println("ADDRESS"+m.Address);
		System.out.println("AGE:"+m.Age);
		m.printSalary();
		System.out.println("PHONE NUMBER:"+m.Phone_Number);
		System.out.println("DEPARTMENT:"+m.department);
		System.out.println();
		System.out.println("employee:");
		Employee e=new Employee("shalini","coimbatore",22,35000,8940500895l,"computerscience");
		System.out.println("NAME:"+e.Name);
		System.out.println("ADDRESS"+e.Address);
		System.out.println("AGE:"+e.Age);
		e.printSalary();
		System.out.println("PHONE NUMBER:"+e.Phone_Number);
		System.out.println("DEPARTMENT:"+e.specialization);
		

	}

}
>>>>>>> faf40c80cde0c8919ea544fd4b6d0711649644d7
