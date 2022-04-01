package com.tys.treeset;
import java.util.*;

public class TreeSetSort {
	public static void main(String[] args)
	{
	Employee e = new Employee(2, "susi");
	Employee e1 = new Employee(1, "shashi");
	Employee e2 = new Employee(3, "sow");
	Employee e3 = new Employee(4,"deeps");
	Employee e4 = new Employee(5, "asha");
	TreeSet<Employee> treeset = new TreeSet<>();
	treeset.add(e4);
	treeset.add(e1);
	treeset.add(e3);
	treeset.add(e);
	treeset.add(e2);
	treeset.add(e2);
	System.out.println(treeset);
	
	
	}
}
