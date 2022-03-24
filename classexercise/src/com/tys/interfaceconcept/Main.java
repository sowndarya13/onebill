package com.tys.interfaceconcept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio c=new Casio();
		System.out.println(c.add(1,2));
		System.out.println(c.sub(1,2));
		System.out.println(c.multiple(1,2));
		System.out.println(c.div(1,2));
		//Calculator c1=new Casio();//upcasting possible,but obj creation for interface not possible
		
		

	}

}
