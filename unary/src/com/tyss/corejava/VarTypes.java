package com.tyss.corejava;

public class VarTypes {
	
	static int a=7;
	int b=13;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=5;
		System.out.println("static");
		System.out.println(VarTypes.a);
		VarTypes v=new VarTypes();
		System.out.println("instance");
		System.out.println(v.b);
		System.out.println("local");
		System.out.println(b);
		
		

	}

}
