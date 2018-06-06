package com.rhb.afaisal;

import java.util.Scanner;

/**
 * Question 7 - Given a variable WS-A, the possible value is 1, 2 & 3, and a variable WS-B, the possible value is a or b
 * Write a flow chart to validate both combination of WS-A and WS-B are input the correct values. If both input value were
 * in their respective range, display a statement 'WS-A and WS-B having the value in their respective range' else display
 * statement 'one of them (WS-A & WS-B) not in their value range'
 */
public class QuestionSeven {
    public static void main(String[] args) {
        System.out.println("Hello! This program accepts an integer input for WS-A variable which range between 1 and 3, and a String input for WS-B variable which range between a and b. In case if the enter value for either or both variable is out of range, an error message will be displayed.");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the value for WS-A variable:");
        int wSA = inputScanner.nextInt();

        System.out.println("Enter the value for WS-B variable:");
        String wSB = inputScanner.next();

        if ((wSA < 1 || wSA > 3) || !(wSB.equals("a") || wSB.equals("b"))) {
            System.out.println("One of them (WS-A & WS-B) not in their value range");
            System.exit(0);
        }

        System.out.println("WS-A and WS-B having the value in their respective range");
    }
}
