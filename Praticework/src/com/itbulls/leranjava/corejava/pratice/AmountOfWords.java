package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	    //<write your code here>
	    String text = sc.nextLine();
	    int amountOfWords = getWordsAmount(text);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
	//	<write your code here>
	text =text.trim();
	if(text.isEmpty()){
	    return 0;
	}
	String[] words = text.split("\\s+");
	return words.length;
	}
}
