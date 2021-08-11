package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Checks whether a year is Leap year or not
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class LeapYear {

    public static void main(String[] args) {
        // Running a While loop to keep data within the range (4 digit number)
        while (true) {
            //taking user input
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a year in YYYY format");
            //variable year will contain numeric year value
            int year = userInput.nextInt();
            //condition to check year within limit
            if (year > 999 && year <= 9999) {
                //condition to check leap year
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " is a Leap year");
                } else {
                    System.out.println(year + " is a Leap not year");
                }
                break;
            }
        }
    }
}