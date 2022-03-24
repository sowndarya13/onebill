package com.tys.project;

public class Strore1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s=new SmartPhone(64,3,64,20000,4);
		System.out.println("price:"+s.price+" "+"ram:"+s.ram+" "+"rom:"+s.rom+" "+"camera:"+s.camera+" "+"camcount:"+s.camCount);
		SmartPhone n=new SmartPhone(10000,3);
		System.out.println(n.price+" "+n.ram);
		
		
		

	}

}
