package com.tys.hashsetcomparable;
import java.util.*;

public class StudentExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("sow",1,"IT",8825583593l);
		Student s2=new Student("susi",2,"CS",8825583591l);
		Student s3=new Student("sakshi",3,"EIE",8825583592l);
		Student s4=new Student("shasha",4,"CIVIL",8825583594l);
		Student s5=new Student("abarna",5,"MECH",8825583595l);
		  Student s6=new Student("shasha",4,"civil",8825583594l);
		 
		HashSet<Student> hashset=new HashSet<Student>();
		hashset.add(s1);
		hashset.add(s2);
		hashset.add(s3);
		hashset.add(s4);
		hashset.add(s5);
		hashset.add(s5);
		hashset.add(s6);
		 System.out.println("before sort");  
		System.out.println(hashset);
	    ArrayList<Student> arraylist=new ArrayList<>(hashset);
	    Collections.sort(arraylist);
	    Iterator<Student> i=arraylist.iterator();
	    System.out.println("After sort");
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    

	}

}
