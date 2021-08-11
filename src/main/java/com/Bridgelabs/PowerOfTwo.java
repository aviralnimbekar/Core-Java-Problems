package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Prints table of power of 2
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        //taking user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter power");
        //variable res will contain numeric value of power
        int res = userInput.nextInt();

        int value = 1;      //Initialising variable for initial value of table
        for (int i = 1; i <= res; i++) {
            value = value * 2;
            System.out.println(value);
        }
    }
}
