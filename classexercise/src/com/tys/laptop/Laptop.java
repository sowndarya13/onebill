package com.tys.laptop;

/**
 * @author admin
 *
 */
public class Laptop {
	String brand;
	Rom rom;
	Battery battery;
	Screen screen;
	int price;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", rom=" + rom + ", battery=" + battery + ", screen=" + screen + ", price="
				+ price + "]";
	}
	
	}
