package com.tys.multilevelinheritance;

public class Bike extends vehicle {
	String fuelType;
	String engineType;
	Bike()
	{
		System.out.println("Bike cons 0 para");
	}
	Bike( int speed, String gasType,int no_of_wheels,int price, String fuelType,String engineType)
	{
		super(speed,gasType,no_of_wheels,price);
		this.fuelType=fuelType;
		this.engineType=engineType;
		System.out.println("Bike cons no. of para");
	}
	public void speedometer()
	{
		System.out.println("displays speed of the bike");
		
	}
	public void fuelContent()
	{
		System.out.println("display fuel content in the tank");
	}

}
