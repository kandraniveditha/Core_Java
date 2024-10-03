package com.itbulls.leranjava.corejava.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Please, Enter any Text: ");
     String userInput = sc.nextLine();
     System.out.println("You Entered these Words: ");
     System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
     /*
      * Please, Enter any Text: 
        ads!!! , a;ads asd; !! / ?? asda
        You Entered these Words: 
        [ads, a, ads, asd, asda]
      */

	}

}
