package com.tys.multilevelinheritance;

public class vehicle {
	int speed;
	String gasType;
	int no_of_wheels,price;
	vehicle()
	{
		System.out.println("vehicle cons no para");
	}
	vehicle(int speed,String gasType,int no_of_wheels,int price)
	{
		this.speed=speed;
		this.gasType=gasType;
		this.no_of_wheels = no_of_wheels;
		this.price=price;
		System.out.println("vehicle cons no. of  para");
	}
	public void brake()
	{
		System.out.println("stop....");
	}

}
