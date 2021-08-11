package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Prints a Harmonic Series
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class HarmonicNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter nth number");
        int N = userInput.nextInt();

        String series = "1/1";
        for (int i = 2; i <= N; i++) {

            series = series + " + " + "1/" + i;
        }
        System.out.println("HP = " + series);
    }
}