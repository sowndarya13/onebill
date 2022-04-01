package com.tys.linkesdhashsetcompare;
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
		 
		LinkedHashSet<Student> h=new LinkedHashSet<Student>();
		h.add(s1);
		h.add(s3);
		h.add(s4);
		h.add(s2);
		h.add(s5);
		h.add(s5);
		h.add(s6);//this not gets inti set because it has duplicacy element that is name as we overridden .equals
		System.out.println("Before sort");
		System.out.println(h);
	    ArrayList<Student> arraylist=new ArrayList<>(h);
	    int choice=0;
		System.out.println("choose ur sorting method:\n1.sort by id\n2.sort by name");
		System.out.println("Enter ur choice:");
		Scanner s=new Scanner(System.in);
		while(true)
		{
		choice=s.nextInt();
		if(choice<=2&&choice>0)
			break;
		else
			System.out.println("give correct choice");
		}
		System.out.println("after sorting");
		switch(choice)
		{
		case 1:SortById sortbyid = new SortById();
	           Collections.sort(arraylist,sortbyid);
	           break;
		case 2:SortByName sortbyname = new SortByName();
		       Collections.sort(arraylist,sortbyname);
		       break;
		}
		System.out.println("After using comparator");
		for (Student student : arraylist) {
			System.out.println(student);
		}
		Collections.sort(arraylist);
		System.out.println("after using comparable to sort by id,the set is:"); 
	    Iterator<Student> i=arraylist.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    

	}

}
