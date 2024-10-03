package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, Enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		for (char digit : intString.toCharArray()) {
			System.out.println(digit);
		}
	}

}
/*
Please, Enter any integer: 
1543561
1
5
4
3
5
6
1*/