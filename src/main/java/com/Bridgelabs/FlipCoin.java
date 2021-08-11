package com.Bridgelabs;

import java.util.Scanner;

/**
 * Objective - Simulates Flip Coin and counts Head Vs Tail percentage
 *
 * @author - Aviral N
 * @version - 1.0
 */
public class FlipCoin {

    public static void main(String[] args) {
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of time you want to flip-");
        int num = sc.nextInt();

        //Initialising variable that counts number of head and tail
        float headCount = 0;
        float tailCount = 0;

        for (int i = 1; i <= num; i++) {

            float randomCheck = (float) (Math.random()); //generating number [0, 1)
            if (randomCheck < 0.5) {                    //number Ranging [0, 5) gives HEAD
                headCount++;
            } else {                                    //number Ranging [0.5, 1) gives TAILS
                tailCount++;
            }
        }

        //Percentage computation
        float headPercent = (headCount / num) * 100;
        System.out.println("Head% - " + headPercent + "%");
        float tailPercent = (tailCount / num) * 100;
        System.out.println("Tail% - " + tailPercent + "%");
    }
}