package com.rhb.afaisal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Question 4 - Write a program, given a number N, find all the even numbers that exists from 1 to N
 */
public class QuestionFour {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Hello! This program accepts an integer input, and will print out all the even numbers within the number range of the input.");
        System.out.println("Please enter your number:");
        int input = inputScanner.nextInt();

        int counter = 1;
        List<Integer> aList = new ArrayList<>();
        while (counter <= input) {
            // Use modulus operator to get the remainder
            // If remainder is 0, then it's an even number
            if (counter % 2 == 0) {
                aList.add(counter);
            }

            counter++;
        }

        System.out.println("The even numbers are:");
        System.out.println(aList.stream().map(n -> n.toString()).collect(Collectors.joining(", ")));
    }
}