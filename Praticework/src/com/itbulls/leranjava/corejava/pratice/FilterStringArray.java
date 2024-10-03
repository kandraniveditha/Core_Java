package com.itbulls.leranjava.corejava.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter any words sepersted by space: ");
		String userInput = sc.nextLine();
		System.out.println("Please, enter minimum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filterWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filterWords));
	}
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] filteredArray = new String[words.length];
		for(int i=0; i<words.length; i++) {
			if(words[i].length() >= minLength) {
				filteredArray[i] = words[i];
			}
		}
	filteredArray = filterNulls(filteredArray);
	return filteredArray;
	}
	
	private static String[] filterNulls(String[] arr) {
		int newArraySize = 0;
		for(String word : arr) {
			if(word != null) {
				newArraySize++;
			}
		}
		String[] filteredArray = new String[newArraySize];
		
		int filteredArrayIndex = 0;
		for(String word : arr) {
			if(word!= null) {
				filteredArray[filteredArrayIndex++] = word;
			}
		}
		return filteredArray;
	}
	
	public static String[] filteredWordsByLengthStreanApi(int minLength, String[] words) {
		return Arrays.stream(words)
				.filter(s -> s.length() >= minLength)
				.toArray(String[]::new);
	}

}
 