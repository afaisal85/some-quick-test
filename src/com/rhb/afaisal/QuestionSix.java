package com.rhb.afaisal;

import java.util.Scanner;

/**
 * Question 6 - Write a program, define an array of size n, write a routine that loop from 1 until n and display the value of the array elements
 */
public class QuestionSix {
    public static void main(String[] args) {
        System.out.println("Hello! This program accepts an integer input, and the value of the integer will determine the size of an array. Then, user will have to enter the element of the array, and the program then will iterate the array and display the elements.");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter the size of an array:");
        int size = inputScanner.nextInt();

        String[] array = new String[size];
        int counter = 0;

        while (counter < size) {
            System.out.println(String.format("Please enter a String value for array index %d:", counter + 1));
            array[counter] = inputScanner.next();
            counter++;
        }

        System.out.println("The elements in the array are:");
        for (String element: array) {
            System.out.println(element);
        }
    }
}
