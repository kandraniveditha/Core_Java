package com.itbulls.leranjava.corejava.pratice.SolidOops;

public class UserRegistration {
    public static boolean registerUser(String username, String password) {
       if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)){
           System.out.println("User Registered Sucessfully.");
           return true;
       } else {
           System.out.println("Invalid Username and password.");
           return false;
       }
    }
}