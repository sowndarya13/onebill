package com.tys.hashset;
import java.util.*;

public class SortByName implements Comparator<Student> {
	public int compare(Student o1,Student o2)
	{
		return o1.name.compareTo(o2.name);
	}

}
