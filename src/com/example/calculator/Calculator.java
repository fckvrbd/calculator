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

    // Main
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Makes scanner for user input

        System.out.println("Please type in whether you want to use (add)ition or (sub)straction");
        String calcMethod = userInput.nextLine(); // Asks for method of calculation

        System.out.println("Please enter your first and second number: ");

        int userNum1 = userInput.nextInt(); // Asks for first number
        int userNum2 = userInput.nextInt(); // Asks for second number

        if (calcMethod.equals("add")) {
            System.out.println("Your answer is: " + addition(userNum1, userNum2)); // Shows result
        }

        else if (calcMethod.equals("sub")) {
            System.out.println("Your answer is: " + subtraction(userNum1, userNum2)); // Shows result
        }
    }
}
