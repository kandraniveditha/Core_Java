package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class AreaOfTraingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This Program willcalculate area of Traingle");
		System.out.println("Please, Enter A side of a Triangle:");
		double sideA =sc.nextDouble();
		
		System.out.println("Please, Enter B side of a Triangle:");
		double sideB =sc.nextDouble();
		
		System.out.println("Please, Enter C side of a Triangle:");
		double sideC =sc.nextDouble();
		
		double p = (sideA + sideB + sideC) / 2;
		double triangleArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
		System.out.println("Triangle area is: " + triangleArea);
		
		/*
		 * This Program willcalculate area of Traingle 
		 * Please, Enter A side of a Triangle: 10 
		 * Please, Enter B side of a Triangle: 10 
		 * Please, Enter C side of a  Triangle: 10 
		 * Triangle area is: 43.30127018922193
		 */
	}

}
