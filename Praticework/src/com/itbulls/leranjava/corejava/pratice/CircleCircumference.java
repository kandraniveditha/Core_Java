package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program will be calculate circumference");
		System.out.println("please Enter Circle Radius: ");
		double radius = sc.nextDouble();
		
		double circleCircumference = 2 * Math.PI * radius;
		System.out.println("Circle Circumference is: " + circleCircumference);

	}

}
/*
This program will be calculate circumference
please Enter Circle Radius: 
5
Circle Circumference is: 31.41592653589793 */