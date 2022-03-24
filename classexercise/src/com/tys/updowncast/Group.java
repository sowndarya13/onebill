package com.tys.updowncast;

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new Admin("sowndarya",8825583593L);//here object od admin is upcasted to superclass user.so it can access only base class members
		//THIS IS THE ONE AND ONLY OBJECT THAT IS CREATED HERE
		user.chat();
		user.share();
		user.call();
		//THE NEXT LINE IS NOT THE OBJECT CREATION .ITS JUST A DOWNCASTING STATEMENT
		Admin admin=(Admin)user;//DOWNCASTING//downcasting is possible by explicitly mentioning the downcast type and there must be upcast for that object before downcasting it
		admin.chat();
		admin.call();
		admin.share();
		admin.addUser("Nivash");
		admin.removeUser("sow");
}
}
