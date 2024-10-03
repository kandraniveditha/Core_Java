package com.itbulls.leranjava.corejava.pratice.SolidOops;

public class UserAuthenticator {
    public static boolean authenticateUser(String username, String password) {
       if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)){
           System.out.println("User Authentication Sucessfully.");
           return true;
       } else {
           System.out.println("Invalid Username or password.");
           return false;
       }
    }
}
