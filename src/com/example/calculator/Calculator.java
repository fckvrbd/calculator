package com.example.calculator;

import java.util.Scanner;

class calculator {

    // Addition
    static int addition(int num1, int num2) {
        return num1 + num2; // Returns value
    }

    // Subtraction
    static int subtraction(int num1, int num2) {
        return num1 - num2; // Returns value
    }

    // Multiplication
    static int multiplication(int num1, int num2) {
        return num1 * num2; // Returns value
    }

    // Division
    static int division(int num1, int num2) {
        return num1 / num2; // Returns value
    }

    // Main
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Makes scanner for user input

        System.out.println("Please type in whether you want to use one of these following methods:\n(add)ition" +
                                                                                                 "\n(sub)traction" +
                                                                                                 "\n(div)ision" +
                                                                                                 "\n(mul)tiplication");

        String calcMethod = userInput.nextLine(); // Asks for method of calculation

        System.out.println("Please enter your first and second number: ");

        int userNum1 = userInput.nextInt(); // Asks for first number
        int userNum2 = userInput.nextInt(); // Asks for second number

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
                System.out.println("Please enter a valid method");
                break;
        }
    }
}
