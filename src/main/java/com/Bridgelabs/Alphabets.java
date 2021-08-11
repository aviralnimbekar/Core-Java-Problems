package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Shows Vowels and Consonants
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class Alphabets {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = userInput.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Not an Alphabet");
        }
    }
}