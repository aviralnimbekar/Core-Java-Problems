package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Swaps value between two variable
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class SwapNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number X");
        int x = userInput.nextInt();
        System.out.println("Enter second number Y");
        int y = userInput.nextInt();
        System.out.println("Before Swap");
        System.out.println("X = " + x + "\n"
                + "Y = " + y);

        int temp = x;       //storing x in a temporary variable
        x = y;              //storing y in x
        y = temp;           //storing temporary variable in x
        System.out.println("After swap");
        System.out.println("X = " + x + "\n"
                + "Y = " + y);
    }
}
