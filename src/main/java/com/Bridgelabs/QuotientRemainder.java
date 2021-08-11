package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Prints Quotient and Remainder of given number
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter dividend");
        int dividend = userInput.nextInt();
        System.out.println("Enter Divisor");
        int divisor = userInput.nextInt();

        //computing quotient
        int Quoti = dividend / divisor;
        System.out.println("Quotient = " + Quoti);
        //computing Remainder
        int remind = dividend % divisor;
        System.out.println("Remainder = " + remind);
    }
}