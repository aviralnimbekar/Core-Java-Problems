package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Prints Prime factor of given number
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class PrimeFactor {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number");
        int num = userInput.nextInt();

        //Running loop from 2(1st prime number) to given number
        for (int i = 2; i <= num; i++) {

            //running loop to check whether i completely divides the number
            while (num % i == 0) {
                num /= i;
                System.out.println(i);
            }
        }
    }
}