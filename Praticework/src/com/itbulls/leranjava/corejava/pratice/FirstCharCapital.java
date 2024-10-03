package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;
public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
	String[] words = string.split("\\s+");
	StringBuilder titleCase = new StringBuilder();
	
	for(String word : words) {
	    if(word.length() > 0){
	        titleCase.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
	    }
	}
	return titleCase.toString().trim();
	}
}
