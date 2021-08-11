package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - give the Largest number among given numbers
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class LargestNumber {

    public static void main(String[] args) {

        //taking 3 variable x, y and z
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = userInput.nextInt();
        System.out.println("Enter 2nd number");
        int y = userInput.nextInt();
        System.out.println("Enter 3rd number");
        int z = userInput.nextInt();

        //printing all numbers
        System.out.println("Numbers are " + x + " " + y + " " + z);

        //comparing all numbers
        if (x > y && x > z) {
            System.out.println("Largest number = " + x);
        } else if (y > x && y > z) {
            System.out.println("Largest number = " + y);
        } else {
            System.out.println("Largest number = " + z);
        }
    }
}
