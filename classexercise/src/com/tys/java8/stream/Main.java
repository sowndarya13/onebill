package com.tys.java8.stream;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BeanClass> aslist=Arrays.asList(new BeanClass(1,"krishna","developer",40000)
				,new BeanClass(2,"raj","tester",50000)
				,new BeanClass(3,"hari","developer",60000)
				,new BeanClass(4,"abisheika","developer",30000));
		
		
		Stream<BeanClass> stream = aslist.stream();
		aslist.stream().max(Comparator.comparing(BeanClass::getSalary)).ifPresent(System.out::println);
		System.out.println("============ANY MATCH BREAKDOWN===========");
		Predicate<BeanClass> p= (bean)->{
			return bean.getName()=="abisheka";
		};
		boolean t=stream.anyMatch(p);
		System.out.println(t);
		System.out.println("=========any match==========");
		boolean anymatch=aslist.stream().anyMatch(bean->bean.getName()=="abisheika");
		System.out.println(anymatch);
		System.out.println("==========for each and filter=====");
		
		
		
		
		
		
		

	}

}
