package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;
import java.util.HashMap;

public class ConvertDecimalToRoman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mainLoop: while (true) {
            System.out.print("Please, select mode. If you want to convert Roman " +
                    "numbers to decimal type 'R2D' and press enter." +
                    System.lineSeparator() +
                    "If you want to convert decimal numbers to Roman type 'D2R' and press enter: ");
            String mode = sc.next();

            if (mode.equalsIgnoreCase("R2D")) {
                System.out.print("Please, enter Roman number you want to convert: ");

                while (true) {
                    String romanNumber = sc.next();

                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered an invalid Roman number. Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number you want to convert: ");
                    int decimalNumber = sc.nextInt();

                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter a positive integer from 1 to 100.");
                        continue;
                    }
                }
            } else {
                System.out.println("Please, enter 'R2D' or 'D2R'.");
            }
        }
    }

    /**
     * Converts decimal numbers to Roman.
     * Takes an int value as a parameter. Works only with numbers from 1 to 100.
     *
     * @param number to convert to Roman.
     * @return string of Roman number.
     */
    public static String decimal2Roman(int number) {
        String[] romanNumerals = new String[] {
                "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] decimalValues = new int[] {
                100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (number >= decimalValues[i]) {
                result.append(romanNumerals[i]);
                number -= decimalValues[i];
            }
        }

        return result.toString();
    }

    /**
     * Converts Roman numbers to decimal.
     * Takes a string value with a Roman number as a parameter.
     *
     * @param romanNumber the Roman numeral string.
     * @return decimal representation of the Roman number.
     */
    public static int roman2Decimal(String romanNumber) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);

        int decimalValue = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char currentChar = romanNumber.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < previousValue) {
                decimalValue -= currentValue;
            } else {
                decimalValue += currentValue;
            }

            previousValue = currentValue;
        }

        return decimalValue;
    }

    /**
     * Validation for Roman numbers using regular expression.
     * This checks if the string could be a valid Roman number.
     *
     * @param romanNumber the Roman numeral string.
     * @return true if the string is a valid Roman number.
     */
    public static boolean isRomanNumberValid(String romanNumber) {
        return romanNumber.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    /**
     * Validation for decimal numbers to ensure they are between 1 and 100.
     *
     * @param decimalNumber the integer number.
     * @return true if the number is between 1 and 100.
     */
    public static boolean isDecimalNumberValid(int decimalNumber) {
        return decimalNumber > 0 && decimalNumber <= 100;
    }
}