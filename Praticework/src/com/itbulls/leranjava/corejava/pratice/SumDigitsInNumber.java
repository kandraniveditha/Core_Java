package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
	number = Math.abs(number);
	int sum = 0;
	
	while (number != 0){
	    sum += number % 10;
	    number = number / 10;
	}
	return sum;
	}
}