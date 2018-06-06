package com.rhb.afaisal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Question 5 - Write a program, given a number R, P, formula I = P x (R / 100) x (1 / 365), write a routine to calculate I
 */
public class QuestionFive {
    public static void main(String[] args) {
        System.out.println("Hello! This program accepts 2 integer input, the R and P, and will calculate the value of I based on the formulae \"I = P x (R / 100) x (1 / 365)\".");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter your R integer:");
        int r = inputScanner.nextInt();
        System.out.println("Please enter your P integer:");
        int p = inputScanner.nextInt();

        System.out.println(String.format("Your result is: %1$,.10f", calculate(new BigDecimal(r), new BigDecimal(p))));
    }

    private static BigDecimal calculate(final BigDecimal r, final BigDecimal p) {
        // P x (R / 100) x (1 / 365)
        return p
                .multiply(r.divide(new BigDecimal(100), 10, BigDecimal.ROUND_UP))
                .multiply(new BigDecimal(1).divide(new BigDecimal(365), 10, BigDecimal.ROUND_UP));
    }
}
