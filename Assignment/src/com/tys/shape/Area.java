package com.tys.shape;

public class Area extends Shape{
	void RectangleArea(int length,int breadth)
	{
		System.out.println("Area of rectangle is "+length*breadth);
	}
	 void SquareArea(int side)
	 {
		 System.out.println("Area of square is "+side*side);
	 }
     void CircleArea(float radius)
     {
    	 System.out.println("Area of Circle is "+3.14f*radius*radius);
     }
	

}
