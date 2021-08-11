package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Checks whether number is even or odd
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class OddEven {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number");
        int num = userInput.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
