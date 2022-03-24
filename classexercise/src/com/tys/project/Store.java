/**
 * 
 */
package com.tys.project;

public class Store {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone P=new Phone();
		P.call();
		P.message("hey...hi");
		P.radio();
		SmartPhone s=new SmartPhone(64,3,64.0,20000,4);
		s.call();
		s.message("are you there?");
		s.radio();
		s.play();
		s.selfie();
		Samsung S=new Samsung();
		S.fold();
		IPhone i=new IPhone();
		i.os="ios";
	}

}
