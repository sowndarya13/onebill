package com.tys.project;

public class SmartPhone extends Phone {
	double camera;
	int camCount,rom;
	public SmartPhone()
	{
		
	}
	public SmartPhone(int r,int cC,double cam,int p,int ram)
	{
		//super();//this calls no argument cons in base class
        super(p,ram);
		camera=cam;
		camCount=cC;
		rom=r;
		System.out.println("smartphone cons with 5 par");
	}
	public SmartPhone(int price,int ram)
	{
		super(price,ram);
		System.out.println("smartphone cons with 2 parameter");
		
	}
	public void selfie()
	{
		System.out.println("smileee.....");
	}
	public void play()
	{
		System.out.println("playing pubg");
	}

}
