package com.example.util;
import com.example.geomatry.*;
public class Calculator {

	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Rectangle r1=new Rectangle(5, 5);
		double cirArea=Math.PI*Math.pow(c1.radius, 2);
		double recArea=r1.length*r1.width;
		System.out.println("Circle area = "+cirArea+"Rectangle area = "+recArea);
	}
}
