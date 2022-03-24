package com.tyss.corejava;

public class MulFunc {
	
	static float mul(float a,float b)//static is used for using the function without creating object
	{
		return a*b;
	}
    static boolean check(char a,char b)
    {
    	if(a>b)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float res=MulFunc.mul(5.5f,6);
		System.out.println(res);
		boolean a=MulFunc.check('a','A');
		System.out.println(a);

	}

}
