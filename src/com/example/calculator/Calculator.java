package com.example.calculator;

import java.util.Scanner;

class calculator {

    // Addition
    static double addition(double num1, double num2) {
        return num1 + num2; // Returns value
    }

    // Subtraction
    static double subtraction(double num1, double num2) {
        return num1 - num2; // Returns value
    }

    // Multiplication
    static double multiplication(double num1, double num2) {
        return num1 * num2; // Returns value
    }

    // Division
    static double division(double num1, double num2) {
        return num1 / num2; // Returns value
    }

    // Main
    public static void main(String[] args) {
        String repeatCondition;

        do {
            Scanner userInput = new Scanner(System.in); // Makes scanner for user input

            System.out.println("Please type in whether you want to use one of these following methods:\n(add)ition" +
                    "\n(sub)traction" +
                    "\n(div)ision" +
                    "\n(mul)tiplication");

            String calcMethod = userInput.nextLine(); // Asks for method of calculation

            System.out.println("Please enter your first and second number: ");

            double userNum1 = userInput.nextDouble(); // Asks for first number
            double userNum2 = userInput.nextDouble(); // Asks for second number

            switch (calcMethod) {
                case "add":
                    System.out.println("Your answer is: " + addition(userNum1, userNum2)); // Shows result
                    break;

                case "sub":
                    System.out.println("Your answer is: " + subtraction(userNum1, userNum2)); // Shows result
                    break;

                case "mul":
                    System.out.println("Your answer is: " + multiplication(userNum1, userNum2)); // Shows result
                    break;

                case "div":
                    System.out.println("Your answer is: " + division(userNum1, userNum2)); // Shows result
                    break;

                default:
                    System.out.println("Please enter a valid method"); // If method given is unknown
                    break;
            }

            System.out.println("Do you want to try again? (Y)/(N):");
            repeatCondition = userInput.next();
        }

        while (repeatCondition.equals("Y"));
    }
}
