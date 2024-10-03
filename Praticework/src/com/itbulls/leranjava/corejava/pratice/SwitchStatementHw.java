package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;

public class SwitchStatementHw {

	public static void main(String[] args) {
    
		System.out.println("Please, enter action name: ");
		Scanner sc = new Scanner(System.in);
		String userInput =  sc.nextLine();
		
		switch (userInput) {
		case "login":
			System.out.println("Please, Enter your Username");
			break;
		case "sign_up":
			System.out.println("Welcome!");
			break;
		case "terminate_program":
			System.out.println("Thank you! Good bye!");
			break;
		case "main-menu":
			System.out.println("Main Menu");
			break;
		case "about_app":
			System.out.println("This app is created by me with" 
		+ " support of \u00AEIT-Bulls.com");
			break;
			default:
				System.out.println("Please, Enter one of these values: login," 
			+ "sign_up, treminate_program, main_menu, about_app");
				break;
		}

	}

}
