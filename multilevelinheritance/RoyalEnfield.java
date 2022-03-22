package com.tys.multilevelinheritance;

public class RoyalEnfield extends Bike {
	String color;
	RoyalEnfield(int speed, String gasType,int no_of_wheels,int price, String fuelType,String engineType,String color)
	{
		super(speed,gasType,no_of_wheels,price,fuelType,engineType);
		this.color=color;
		System.out.println("Enfield cons no. of  para");
	}
	public void selfstart()
	{
		System.out.println("Automatically starts with a button press......");
	}
	public static void main(String[] args)
	{
		RoyalEnfield r=new RoyalEnfield(100,"no2",2,250000,"petrol","single_cylinder","kakki");
		System.out.println(r.speed);
		System.out.println(r.gasType);
		System.out.println(r.no_of_wheels);
		System.out.println(r.price);
		System.out.println(r.fuelType);
		System.out.println(r.engineType);
		System.out.println(r.color);
	}

}
