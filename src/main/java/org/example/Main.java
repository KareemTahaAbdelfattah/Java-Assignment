/** ========================================**
 ** @Author: Kareem Taha Abd El-Fattah
 ** @Category: Route Diploma
 ** @brief: Java Code Assignment
/** ========================================**/

package org.example;

import java.util.Scanner;

public class Main {
    /**
     * Starts the program and keeps showing the menu until the user chooses to exit.
     * It reads the user's choice, calls the required method, and prints the result.
     * @param args command-line values sent when the program starts
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    PrintNumbersDescending();
                    break;

                case 2:
                    PrintEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();
                    String result = CheckNumberType(number);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = input.nextInt();

                    int sum = CalculateSum(number1, number2);
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice, Enter Valid Choice");
            }

            System.out.println();

        } while (choice != 5);

        input.close();
    }

    /**
     * Displays the numbers in reverse order starting from 10 down to 1.
     * This method only prints the values and does not return anything.
     */
    public static void PrintNumbersDescending(){
            for(int i = 10; i > 0; i--){
                System.out.println(i);
            }
    }

    /**
     * Prints the numbers from 1 to 10 and shows whether each value is even or odd.
     * The decision is made by checking the remainder after division by 2.
     */
    public static void PrintEvenOrOdd(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * Checks the sign of a number and returns its type as text.
     * @param number the integer entered by the user to be tested
     * @return "Positive" if the number is above zero, "Negative" if it is below zero, otherwise "Zero"
     */
    public static String CheckNumberType(int number){
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two integer values and sends back the total.
     * @param number1 the first integer value
     * @param number2 the second integer value
     * @return the result after adding the two numbers together
     */
    public static int CalculateSum(int number1, int number2){
        return number1 + number2;
    }
}