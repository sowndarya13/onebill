package com.tys.project;

public class Phone {
        int price,ram;
        String brand;
        Phone()
        {
        	
        }
        Phone(int p,int r)
        {
        	price=p;
        	ram=r;
        	System.out.println("Phone cons");
        }
        public void phone()
        {
        	System.out.println("i bought a phone");
        }
        public void call()
        {
        	System.out.println("calling....");
        }
        public void radio()
        {
        	System.out.println("playing songs....");
        }
        public void message(String msg)
        {
        	System.out.println(msg);
        }
        
}
