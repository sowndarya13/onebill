package com.tys.runnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
        Thread thread=new Thread(m);//here by giving the mythread obj gives the sense to the thread that the run()
        //is overridden in mythread. 
        thread.start();
         
	}

}
