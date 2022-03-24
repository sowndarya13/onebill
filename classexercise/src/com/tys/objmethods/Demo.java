package com.tys.objmethods;

public class Demo {
	
	

/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize(); 
	} */
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Demo)
			return true;
		else
			return false;
			 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Demo obj";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("this is final"); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		int r=d.hashCode();
		System.out.println(r);
		boolean e=d.equals(d);
		System.out.println(e);
		String s=d.toString();
		System.out.println(s);
		d=null;//if the obj is assigned to null,then the finalize method will be called automatically
		System.gc();
		

	}
	

}
