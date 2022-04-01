package com.tys.laptop;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery battery=new Battery();
		Rom rom= new Rom();
		Screen screen= new Screen();
		Laptop laptop=new Laptop();
		System.out.println(battery);
		System.out.println(laptop);
		System.out.println(rom);
		System.out.println(screen);
		battery.capacity=20000;
		battery.type="lithium";
		screen.brand="dell";
		screen.resolution=1080;
		screen.type="led";
		rom.size=64;
		rom.type="hhd";
		laptop.brand="Dell";
		laptop.price=100000;
		laptop.battery=battery;
		laptop.rom=rom;
		laptop.screen=screen;
		System.out.println(battery);
		System.out.println(laptop);
		System.out.println(rom);
		System.out.println(screen);

	}

}
