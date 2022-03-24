package com.tys.abstracttype.examples;

public class Abstract {
	public static void main(String[] args)
	{
		Pet p=new PuzzyCat();//upcasting ...though the subclass gets access to only superclass method.but if that method is overridden,overrridden only reflects
		p.sound();
		p.play();
		p.eat();
		Pet j=new Jack();
		j.sound();
		j.play();
		j.eat();
		//j.sleep()//not possible bcoz j has access only to super class members		
		Jack ja=(Jack)j;
		ja.sound();
		ja.sleep();
	}

}
